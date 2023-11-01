
package AccesoData;

import Entidades.Especialidad;
import Entidades.Prestador;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PrestadorData {

    private Connection connection = null;
    EspecialidadData ed = new EspecialidadData();
    
    public PrestadorData() { //cada vez que creas un obj de tipo Afiliado estamos creando una conexión a la base de datos
        this.connection = Conexion.getConexion();

    }

    public void guardarPrestador(Prestador prestador) {
        String sql = "INSERT INTO prestador (nombre, apellido, dni, estado, especialidad) VALUES(?,?,?,?,?)";
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
            String sql = "SELECT p.idPrestador, p.nombre, p.apellido, p.dni,p.estado, e.idEspecialidad FROM prestador p JOIN especialidad e ON p.idEspecialidad = e.idEspecialidad WHERE p.estado=1";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Especialidad especialidad = new Especialidad(rs.getInt("e.idEspecialidad"));
                Prestador prestador = new Prestador(rs.getInt("p.idPrestador"),rs.getString("p.nombre"),rs.getString("p.apellido"),rs.getInt("p.dni"),rs.getBoolean("p.estado"),especialidad);
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
        String sql = "SELECT p.*, e.nombre FROM prestador p INNER JOIN especialidad e ON p.idEspecialidad = e.idEspecialidad "
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

        String sql = "UPDATE prestador SET nombre=?, apellido=?, dni=?, estado=?, especialidad=? WHERE dni = ?";
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
    public void modificarPrestadorMejorado(Prestador prestador) {

        
        try {
            String sql = "UPDATE prestador SET nombre=?, apellido=?,idEspecialidad=? WHERE estado = 1 AND dni=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, prestador.getNombre());
            ps.setString(2, prestador.getApellido());
            ps.setInt(3, prestador.getEspecialidad().getIdEspecialidad());
            ps.setInt(4, prestador.getDni());
            
            int exito = ps.executeUpdate();
            System.out.println(exito);
            
            if (exito >= 1) {
                
                JOptionPane.showMessageDialog(null, "El prestador ha sido modificado");
                
            }else {
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
    
    public Prestador buscarPrestadorPorDni(int dni){
        Prestador prestador = null;
        String sql = "SELECT idPrestador, nombre, apellido, dni, estado, idEspecialidad FROM prestador WHERE dni = ? and estado = 1";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                prestador = new Prestador();
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setDni(rs.getInt("dni"));
                prestador.setEstado(rs.getBoolean("estado"));
                Especialidad especialidad = ed.buscarEspecialidadPorId(rs.getInt("idEspecialidad"));
                prestador.setEspecialidad(especialidad);
            } 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestador" + ex.getMessage());
        }
        return prestador;
    }
    
    public Prestador buscarPrestadorPorId(int id){
        Prestador prestador = null;
        String sql = "SELECT idPrestador, nombre, apellido, dni, estado, idEspecialidad FROM prestador WHERE idPrestador = ? and estado = 1";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                prestador = new Prestador();
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setDni(rs.getInt("dni"));
                prestador.setEstado(rs.getBoolean("estado"));
                Especialidad especialidad = ed.buscarEspecialidadPorId(rs.getInt("idEspecialidad"));
                prestador.setEspecialidad(especialidad);
            } 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestador" + ex.getMessage());
        }
        return prestador;
    }
    
    public void darDeAltaPrestador(int dni){
        
        String sql = "UPDATE prestador SET estado = 1 WHERE dni = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, dni);
            
            int resultado = ps.executeUpdate();
            if(resultado == 1){
               JOptionPane.showMessageDialog(null, "Prestador dado de alta");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al querer ingresar en la tabla Prestador"+ex.getMessage());
        }
        
    }
    
    public Prestador buscarPrestadorAlta(int dni) {
        Prestador prestador= null;
        String sql = "SELECT p.idPrestador, p.nombre, p.apellido, p.dni, p.estado, e.idEspecialidad  FROM prestador p JOIN especialidad e ON p.idEspecialidad = e.idEspecialidad WHERE p.estado = 0 AND dni = ?";
         
        try {
           PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                prestador= new Prestador();
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setDni(rs.getInt("dni"));
                prestador.setEstado(rs.getBoolean("estado"));
                Especialidad especialidad = new Especialidad(rs.getInt("e.idEspecialidad"));
                prestador.setEspecialidad(especialidad);
                
                System.out.println(prestador);

                
            } else {
                
                System.out.println("EL prestador no es válido");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestador " + ex.getMessage());
        }catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "El prestador no es válido " + ex.getMessage());
        }
        return prestador;

    }
    
    public Prestador buscarPrestador(int dni) {
        Prestador prestador= null;
        String sql = "SELECT p.idPrestador, p.nombre, p.apellido, p.dni, p.estado, e.idEspecialidad, e.nombre  FROM prestador p JOIN especialidad e ON p.idEspecialidad = e.idEspecialidad WHERE p.estado = 1 AND dni = ?";
         
        try {
           PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                prestador= new Prestador();
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setDni(rs.getInt("dni"));
                prestador.setEstado(rs.getBoolean("estado"));
                Especialidad especialidad = new Especialidad(rs.getInt("e.idEspecialidad"), rs.getString("e.nombre"));
                prestador.setEspecialidad(especialidad);
                
                System.out.println(prestador);

                
            } else {
                JOptionPane.showMessageDialog(null, "EL prestador no es válido");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestador " + ex.getMessage());
        }catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "El prestador nonai " + ex.getMessage());
        }
        return prestador;

    }
    
        public void eliminarPrestadorDni(int dni) {
        String sql = "UPDATE prestador SET estado = 0 WHERE estado = 1 AND dni = ? ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, dni);
            int eliminado = ps.executeUpdate();
            if (eliminado >= 1) {
                JOptionPane.showMessageDialog(null, "Prestador eliminado");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestador");
        }
    }
            public boolean verificarDniExistente(String dni) {
    try {
        
        String sql = "SELECT COUNT(*) FROM prestador WHERE dni = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, dni);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);
            return count > 0;
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla DNI");
    }
    return false;
}
            
     public List<Prestador> listarPrestadoresPorEspecialidadA(String nombreEspecialidad) {
        List<Prestador> prestadores = new ArrayList<>();
        Especialidad especialidad = null;
        Prestador prestador = null;

        String sql = "SELECT p.nombre, p.apellido, p.dni, p.estado, e.nombre FROM prestador p JOIN especialidad e ON p.idEspecialidad = e.idEspecialidad WHERE e.nombre = ?";
        PreparedStatement ps;

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, nombreEspecialidad);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                especialidad = new Especialidad(rs.getString("e.nombre"));

                prestador = new Prestador(rs.getString("p.nombre"), rs.getString("p.apellido"), rs.getInt("p.dni"), rs.getBoolean("p.estado"), especialidad);
                prestadores.add(prestador);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestador" + ex.getMessage());
        }

        return prestadores;
    }   
     
         public List<Prestador> listarPrestadoresActivosA() {

        Especialidad especialidad = null;
        List<Prestador> prestadores = new ArrayList<>();
        try {
            String sql = "SELECT p.nombre, p.apellido, p.dni, p.estado, e.nombre FROM prestador p JOIN especialidad e ON p.idEspecialidad = e.idEspecialidad WHERE p.estado = 1";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                especialidad = new Especialidad(rs.getString("e.nombre"));

                Prestador prestador = new Prestador(rs.getString("p.nombre"), rs.getString("p.apellido"), rs.getInt("p.dni"), rs.getBoolean("p.estado"), especialidad);

                prestadores.add(prestador);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestador" + ex.getMessage());
        }
        return prestadores;
    }
             public void guardarPrestadorA(Prestador prestador) {
        String sql = "INSERT INTO prestador (nombre, apellido, dni, estado, idEspecialidad) VALUES(?,?,?,?,?)";
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

    
    
}
