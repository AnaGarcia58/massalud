
package Entidades;


public class Afiliado {
    
    private int idAfiliado;
    private String nombre;
    private String apellido;
    private int dni;
    private boolean estado;

    public Afiliado() {
    }

    public Afiliado(int idAfiliado, String nombre, String apellido, int dni, boolean estado) {
        this.idAfiliado = idAfiliado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estado = estado;
    }

    public Afiliado(String nombre, String apellido, int dni, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estado = estado;
    }

    public int getIdAfiliado() {
        return idAfiliado;
    }

    public void setIdAfiliado(int idAfiliado) {
        this.idAfiliado = idAfiliado;
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

    @Override
    public String toString() {
        return "Afiliado{" + "idAfiliado=" + idAfiliado + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", estado=" + estado + '}';
    }
    
    
    
}
