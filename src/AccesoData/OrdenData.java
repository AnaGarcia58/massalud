
package AccesoData;

import Entidades.Afiliado;
import Entidades.Orden;
import Entidades.Prestador;
import Exceptions.GenericException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class OrdenData {
    private Connection connection = null;
    private AfiliadoData ad = new AfiliadoData();
    private PrestadorData pd= new PrestadorData();

    public OrdenData() {
        this.connection = Conexion.getConexion();
    }
    
    public void guardarOrden(Orden orden) {

        try {

            PreparedStatement preparedStatement = null;

            if (comprobarPrestadorFecha(orden)) {

                String insertQuery = "INSERT INTO orden(fecha,formaPago,importe,idAfiliado,idPrestador,estado) VALUES (?,?,?,?,?,?)";

                preparedStatement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
                preparedStatement.setDate(1, java.sql.Date.valueOf(orden.getFecha()));
                preparedStatement.setString(2, orden.getFormaPago());
                preparedStatement.setDouble(3, orden.getImporte());
                preparedStatement.setInt(4, orden.getAfiliado().getIdAfiliado());
                preparedStatement.setInt(5, orden.getPrestador().getIdPrestador());
                preparedStatement.setBoolean(6, orden.isEstado());
                preparedStatement.executeUpdate();

                ResultSet resulSet = preparedStatement.getGeneratedKeys();
                if (resulSet.next()) {
                    orden.setIdOrden(resulSet.getInt(1));
                    JOptionPane.showMessageDialog(null, "Orden añadida con exito.");
                }

            }
            preparedStatement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la Orden: " + ex.getMessage());
        } catch (GenericException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la Orden: " + ex.getMessage());
        }
    }
    
    private boolean comprobarPrestadorFecha(Orden orden) throws GenericException, SQLException {

        PreparedStatement preparedStatement = null;
        boolean resultado = false;
        String dateQuery = "SELECT * FROM orden WHERE fecha = ? AND idPrestador = ? AND idAfiliado = ?";
        preparedStatement = connection.prepareStatement(dateQuery);
        preparedStatement.setDate(1, java.sql.Date.valueOf(orden.getFecha()));
        preparedStatement.setInt(2, orden.getPrestador().getIdPrestador());
        preparedStatement.setInt(3, orden.getAfiliado().getIdAfiliado());

        ResultSet resultSet = preparedStatement.executeQuery();
        resultado = resultSet.next();

        if (resultado) {

            throw new GenericException("No se puede guardar una orden para el mismo dia!");
        } else {
            resultado = true;
            return resultado;
        }
    }
    
    public void anularOrden(int idOrden){
//        String sql = "UPDATE orden SET estado = false WHERE idAfiliado = ? AND idPrestador = ?;";
        String sql = "UPDATE orden SET estado = false WHERE idOrden = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1,idOrden);
//            preparedStatement.setInt(1, idAfilidado);
//            preparedStatement.setInt(2, idPrestador);
            int resultado = preparedStatement.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "La orden fue borrada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Los datos ingresados no son válidos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla orden" + ex.getMessage());
        }
    }

    public List<Orden> obtenerOrdenes(String sql){
        List<Orden> listaOrdenes = new ArrayList<>();
        //String sql = "SELECT * FROM orden";
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));
                Afiliado afiliado = ad.buscarAfiliado(rs.getInt("idAfiliado"));
                Prestador prestador = pd.buscarPrestadorPorId(rs.getInt("idPrestador"));
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);
                orden.setEstado(rs.getBoolean("estado"));
                listaOrdenes.add(orden);
            }
            ps.close();
            }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla orden");
        }
        return listaOrdenes;
    }
    public List<Orden> obtenerOrdenesPorAfiliado(int id){
      String sql = "SELECT * FROM orden o  "
                + "JOIN afiliado a ON o.idAfiliado = a.idAfiliado "
                + "JOIN prestador p ON o.idPrestador = p.idPrestador "
                + "where o.estado = 1 and a.idAfiliado = " + id;
        return this.obtenerOrdenes(sql);  
    }
    
    public List<Orden> obtenerOrdenesPorPrestador(int id){
        String sql = "SELECT * FROM orden o  "
                + "JOIN prestador p ON o.idPrestador = p.idPrestador "
                + "JOIN afiliado a ON o.idAfiliado = a.idAfiliado "
                + "where o.estado = 1 and p.idPrestador = " + id;        
        return this.obtenerOrdenes(sql);
    }
    
 
    public List<Orden> obtenerOrdenPorFecha(LocalDate fecha){
        List<Orden> listaOrdenesPorFecha = new ArrayList<>();
        String sql = "SELECT * FROM orden where fecha = ? and estado = 1";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));
                Afiliado afiliado = ad.buscarAfiliado(rs.getInt("idAfiliado"));
                Prestador prestador = pd.buscarPrestadorPorId(rs.getInt("idPrestador"));
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);
                orden.setEstado(rs.getBoolean("estado"));
                listaOrdenesPorFecha.add(orden);
            }
            ps.close();
            }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla orden");
        }
        return listaOrdenesPorFecha;  
    }
    
   
  
    
}
