
package AccesoData;

import Entidades.Prestador;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PrestadorData {

    private Connection connection = null;

    public PrestadorData() { //cada vez que creas un obj de tipo Afiliado estamos creando una conexión a la base de datos
        this.connection = Conexion.getConexion();

    }

    public void guardarPrestador(Prestador prestador) {
        String sql = "INSERT INTO Prestador (nombre, apellido, dni, estado, especialidad) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, prestador.getNombre());
            ps.setString(2, prestador.getApellido());
            ps.setInt(3, prestador.getDni());
            ps.setBoolean(4, prestador.isEstado());
            ps.setInt(5, prestador.getEspecialidad().getIdEspecialidad());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                prestador.setIdPrestador(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se guardo el prestador exitosamente.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No puede acceder a la tabla prestador" + ex.getMessage());
        }
    }

    public List<Prestador> listarPrestadoresActivos() {
        List<Prestador> prestadores = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Prestador WHERE estado=1";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Prestador prestador = new Prestador();
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setDni(rs.getInt("dni"));
                prestador.setEstado(rs.getBoolean("estado"));
                prestador.setEspecialidad(rs.getInt("idEspecialidad"));//REVER!!!!!!!!

                prestadores.add(prestador);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestador" + ex.getMessage());
        }
        return prestadores;
    }

    public List<Prestador> listarPrestadoresPorEspecialidad() {
        List<Prestador> prestadores = new ArrayList<>();
        String sql = "SELECT p.*, e.nombre FROM Prestador p INNER JOIN Especialidad e ON p.idEspecialidad = e.idEspecialidad "
                + "WHERE p.estado = 1";
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Prestador prestador = new Prestador();
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setDni(rs.getInt("dni"));
                prestador.setEstado(rs.getBoolean("estado"));
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestador" + ex.getMessage());
        }

        return prestadores;
    }

    public void modificarPrestador(Prestador prestador) {

        String sql = "UPDATE Prestador SET nombre=?, apellido=?, dni=?, estado=?, especialidad=? WHERE dni = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, prestador.getNombre());
            ps.setString(2, prestador.getApellido());
            ps.setInt(3, prestador.getDni());
            ps.setBoolean(4, prestador.isEstado());
            ps.setInt(5, prestador.getEspecialidad().getIdEspecialidad());
            int exito = ps.executeUpdate();
            if (exito == 0) {
                JOptionPane.showMessageDialog(null, "El prestador no es válido");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestador" + ex.getMessage());
        }
    }

    public void eliminarPrestador(int id) {
        String sql = "UPDATE Prestador SET estado = 0 WHERE idPrestador = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int eliminado = ps.executeUpdate();
            if (eliminado == 0) {
                JOptionPane.showMessageDialog(null, "Prestador eliminado");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestador");
        }
    }

}
