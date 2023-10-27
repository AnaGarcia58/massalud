
package Entidades;


public class Prestador {
    private int idPrestador;
    private String nombre;
    private String apellido;
    private int dni;
    private boolean estado;
    private Especialidad especialidad;
    private int indice;
    private String mensaje;

    public Prestador() {
    }
    
    public Prestador(int indice, String mensaje) {
        this.indice = indice;
        this.mensaje = mensaje;
    }

    public Prestador(int idPrestador, String nombre, String apellido, int dni, boolean estado, Especialidad especialidad) {
        this.idPrestador = idPrestador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estado = estado;
        this.especialidad = especialidad;
    }

    public Prestador(String nombre, String apellido, int dni, boolean estado, Especialidad especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estado = estado;
        this.especialidad = especialidad;
    }

    public int getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(int idPrestador) {
        this.idPrestador = idPrestador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Prestador{" + "idPrestador=" + idPrestador + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", estado=" + estado + ", especialidad=" + especialidad + '}';
    }
    
     public String obtenerPrestadorCombo(){
        if (indice == -1){
            return mensaje;
        }else{
            return idPrestador + ", " + apellido + ", " + nombre + ", " + dni;
        }    
    }
    
    
}
