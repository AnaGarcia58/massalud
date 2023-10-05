
package massalud;

import AccesoData.AfiliadoData;
import AccesoData.Conexion;
import AccesoData.EspecialidadData;
import Entidades.Afiliado;
import Entidades.Especialidad;


public class Massalud {


    public static void main(String[] args) {
        // TODO code application logic here

        // Conexion.getConexion();
//      Afiliado afiliado = new Afiliado("Mario","Mamani",1234567,true);
//        Afiliado afiliado = new Afiliado("Mer","Atim",1234568,true);
//        Afiliado afiliado = new Afiliado("Tereasa","Campos",1234888,true);
//        AfiliadoData ad = new AfiliadoData();
//        ad.guardarAfiliado(afiliado);
//      ad.bajaAfiliado(1234569);
//        ad.modificarAfiliadoSinEstado(afiliado,1234888);
//        ad.darDeAlta(afiliado);
        Especialidad especialidad = new Especialidad("Oculista", false);
        EspecialidadData ed = new EspecialidadData();
//        ed.guardarEspecialidad(especialidad);
        ed.darBaja(1);
    }
    
}
