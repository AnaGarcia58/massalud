package AccesoData;

import Entidades.Afiliado;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AfiliadoData {

    private Connection connection = null;

    public AfiliadoData() { //cada vez que creas un obj de tipo Afiliado estamos creando una conexión a la base de datos
        this.connection = Conexion.getConexion();
    }

    public void guardarAfiliado(Afiliado afiliado) {
        String sql = "INSERT INTO afiliado (nombre, apellido, dni, estado) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, afiliado.getNombre());
            ps.setString(2, afiliado.getApellido());
            ps.setInt(3, afiliado.getDni());
            ps.setBoolean(4, afiliado.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                afiliado.setIdAfiliado(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se guardo el afiliado exitosamente.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No puede acceder a la tabla afiliado" + ex.getMessage());
        }
    }

    public void bajaAfiliado(int dni) {
        String sql = "UPDATE afiliado SET estado=0 WHERE dni=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, dni);
            int res = ps.executeUpdate();
            if (res >= 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó el afiliado");
            } else {
                JOptionPane.showMessageDialog(null, "El afiliado no es válido");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla afiliado" + ex.getMessage());
        }

    }

    public void modificarAfiliadoSinEstado(Afiliado afiliado) {
        String sql = "UPDATE afiliado SET nombre=?, apellido=?, dni=? WHERE dni=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, afiliado.getNombre());
            ps.setString(2, afiliado.getApellido());
            ps.setInt(3, afiliado.getDni());
            ps.setInt(4, afiliado.getDni());
            int exito = ps.executeUpdate();
            if (exito >= 1) {
                JOptionPane.showMessageDialog(null, "Se modificó el afiliado");
            } else {
                JOptionPane.showMessageDialog(null, "El dni ingresado no es válido");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla afiliado" + ex.getMessage());
        }
    }
    public void darDeAlta(Afiliado afiliado){
        String sql = "UPDATE afiliado SET estado=1 WHERE dni=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, afiliado.getDni());
            int res = ps.executeUpdate();
            if (res >= 1) {
                JOptionPane.showMessageDialog(null, "Afiliado dado de alta");
            } else {
                JOptionPane.showMessageDialog(null, "El afiliado no es válido");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla afiliado" + ex.getMessage());
        }
    }
    
    public void darDeAlta(int dni) {
        String sql = "UPDATE afiliado SET estado=1 WHERE dni=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, dni);
            int res = ps.executeUpdate();
            if (res >= 1) {
                JOptionPane.showMessageDialog(null, "Afiliado dado de alta");
            } else {
                JOptionPane.showMessageDialog(null, "El afiliado no es válido");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla afiliado" + ex.getMessage());
        }
    }
    
    public List<Afiliado> listarAfiliadosActivos() {
        List<Afiliado> afiliados = new ArrayList<>();
        try {
            String sql = "SELECT * FROM afiliado WHERE estado = 1";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Afiliado afiliado = new Afiliado();
                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setDni(rs.getInt("dni"));
                afiliado.setEstado(rs.getBoolean("estado"));
                afiliados.add(afiliado);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliados" + ex.getMessage());
        }
        return afiliados;
    }
        
      public List<Afiliado> listarAfiliadosInactivos() {
        List<Afiliado> afiliados = new ArrayList<>();
        try {
            String sql = "SELECT * FROM afiliado WHERE estado = 0";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Afiliado afiliado = new Afiliado();
                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setDni(rs.getInt("dni"));
                afiliado.setEstado(rs.getBoolean("estado"));
                afiliados.add(afiliado);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliados" + ex.getMessage());
        }
        return afiliados;
    }
         
    public Afiliado buscarAfiliado(int id) {
        Afiliado afiliado = null;
        String sql = "SELECT dni, nombre, apellido, estado FROM afiliado WHERE idAfiliado = ? AND estado = 1";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                afiliado = new Afiliado();
                afiliado.setIdAfiliado(id);
                afiliado.setDni(rs.getInt("dni"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el afiliado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliado");
        }
        return afiliado;
    }
    
       
    public Afiliado buscarAfiliadoPorDni(int dni) {
        Afiliado afiliado = null;
        String sql = "SELECT idAfiliado, nombre, apellido,dni, estado FROM afiliado WHERE dni = ? AND estado = 1";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                afiliado = new Afiliado();
                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                afiliado.setDni(rs.getInt("dni"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setEstado(true);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliado " + ex.getMessage());
        }
        return afiliado;
    }
    
    public Afiliado buscarAfiliados(int dni) {
        Afiliado afiliado = null;
        String sql = "SELECT idAfiliado, dni, nombre, apellido, estado FROM afiliado WHERE dni = ?";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                afiliado = new Afiliado();
                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                afiliado.setDni(rs.getInt("dni"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el afiliado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliado " + ex.getMessage());
        }
        return afiliado;
    }
      }
