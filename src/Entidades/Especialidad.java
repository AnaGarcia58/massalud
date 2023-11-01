
package Entidades;


public class Especialidad {
    private int idEspecialidad;
    private String nombre;
    private boolean estado;

    public Especialidad() {
    }
    
    public Especialidad(int idEspecialidad){
        this.idEspecialidad = idEspecialidad;
    }
    
    public Especialidad(int idEspecialidad, String nombre) {
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
    }

    public Especialidad(String nombre) {
        this.nombre = nombre;
    }

    public Especialidad(int idEspecialidad, String nombre, boolean estado) {
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Especialidad(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return idEspecialidad + ", " + nombre ;
    } 
    
    public String mostrarEnCombo(){
        return "id: "+idEspecialidad+ " Nombre: " + nombre;
    }
    
    public String obtenerEspecialidadCombo(){
        if (idEspecialidad == -1){
            return nombre;
        }else{
            return nombre;
        }    
    }
      
    
}
