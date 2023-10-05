
package AccesoData;

import Entidades.Especialidad;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class EspecialidadData {
    private Connection connection = null;

    public EspecialidadData() {
        this.connection = Conexion.getConexion();
    }
    
   public void guardarEspecialidad(Especialidad especialidad){
       String sql = "INSERT INTO Especialidad (nombre, estado) VALUES (?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, especialidad.getNombre());
            ps.setBoolean(2, especialidad.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                especialidad.setIdEspecialidad((rs.getInt(1)));
                JOptionPane.showMessageDialog(null, "Especilidad añadida con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Especialidad" + ex.getMessage());
        }  
   }
   
   public void darBaja(int id){ //VERRRRR
       String sql = "UPDATE Especialidad SET estado = 0 WHERE idEspecialidad = ?";
       PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sql);
//            ps.setInt(1,especialidad.getIdEspecialidad());
            ps.setInt(1,id);
            int res = ps.executeUpdate();
            if (res>=1){
                JOptionPane.showMessageDialog(null, "Especialidad dada de baja");
            }else{
                JOptionPane.showMessageDialog(null, "Especialidad no válida");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
      
   }
}