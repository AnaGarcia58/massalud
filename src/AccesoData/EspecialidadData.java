
package AccesoData;

import Entidades.Especialidad;
import Exceptions.GenericException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;


public class EspecialidadData {
    private Connection connection = null;

    public EspecialidadData() {
        this.connection = Conexion.getConexion();
    }
    
   public void AgregarEspecialidad(Especialidad especialidad)throws GenericException{
       
        try {
            PreparedStatement preparedStatement;
            if(esIgualElNombre(especialidad)){
                String sql = "INSERT INTO Especialidad (nombre, estado) VALUES (?, ?)";
            preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, especialidad.getNombre());
            preparedStatement.setBoolean(2, especialidad.isEstado());
            preparedStatement.executeUpdate();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()){
                especialidad.setIdEspecialidad((rs.getInt(1)));
                JOptionPane.showMessageDialog(null, "Especilidad añadida con exito");
            }
            preparedStatement.close();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Especialidad" + ex.getMessage());
        }  
   }
   
   public void darBajaPorId(int idEspecialidad){ 
       String sql = "UPDATE Especialidad SET estado = 0 WHERE idEspecialidad = ?";
       PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,idEspecialidad);

            int resultado = preparedStatement.executeUpdate();
            if (resultado >= 1){
                JOptionPane.showMessageDialog(null, "Especialidad dada de baja");
            }else{
                JOptionPane.showMessageDialog(null, "Especialidad no válida");
            }
            preparedStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
      
   }
   public void editarEspecialidad(Especialidad especialidad){
       
       String upDateCuery = "UPDATE especialidad SET nombre = ?, estado = ? WHERE idEspecialidad = ? ";
       
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(upDateCuery);
            
            preparedStatement.setString(1, especialidad.getNombre());
            preparedStatement.setBoolean(2, especialidad.isEstado());
            preparedStatement.setInt(3, especialidad.getIdEspecialidad());
            int resultValue = preparedStatement.executeUpdate();
            if (resultValue >= 1){
                JOptionPane.showMessageDialog(null, "Especialidad fue modificada");
            }else{
                JOptionPane.showMessageDialog(null, "Especialidad no válida");
            }
            preparedStatement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
   }
   public Especialidad buscarEspecialidadPorId(int id){
       
       Especialidad especialidad = null;
       String queryEspecialidad = "SELECT * FROM Especialidad WHERE idEspecialidad = ?";
       
        try {
            
            PreparedStatement preparedStatement = connection.prepareStatement(queryEspecialidad);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()){
                especialidad = new Especialidad();
                especialidad.setNombre(resultSet.getString("nombre"));
                especialidad.setEstado(resultSet.getBoolean("estado"));
                especialidad.setIdEspecialidad(id);
            }

            preparedStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Especialidad");
        }
       return especialidad;
   }
   
   public List<Especialidad> listaDeEspecialidades(){
       
       List<Especialidad> especialidades = new ArrayList<>();

        try {
            String queryEspecialidad = "SELECT * FROM Especialidad ";
            PreparedStatement preparedStatement = connection.prepareStatement(queryEspecialidad);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                Especialidad especialidad = new Especialidad();
                
                especialidad.setIdEspecialidad(resultSet.getInt("idEspecialidad"));
                especialidad.setNombre(resultSet.getString("nombre"));
                especialidad.setEstado(resultSet.getBoolean("estado"));
                
                especialidades.add(especialidad);
            }

            
            preparedStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Especialidad");
        }
       return especialidades;
   }
   
    public boolean esIgualElNombre(Especialidad especialidad) throws SQLException, GenericException {

        boolean isTrue;
        String queryNombre = "SELECT * FROM especialidad WHERE nombre = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(queryNombre);
        preparedStatement.setString(1, especialidad.getNombre());

        ResultSet resultSet = preparedStatement.executeQuery();

        isTrue = resultSet.next();
        if (isTrue) {
            preparedStatement.close();
            throw new GenericException("No se admiten dos especialidades con el mismo nombre");
        } else {
            preparedStatement.close();
            isTrue = true;
            return isTrue;
        }

    }
}