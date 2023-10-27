
package Entidades;

import java.time.LocalDate;


public class Orden {
    private int idOrden;
    private LocalDate fecha;
    private String formaPago;
    private double importe;
    private Afiliado afiliado;
    private Prestador prestador;
    private boolean estado;
    private String mensaje;

    public Orden(String mensaje) {
        this.mensaje = mensaje;
    }

    public Orden() {
    }

    
    
    public Orden(int idOrden, LocalDate fecha, String formaPago, double importe, Afiliado afiliado, Prestador prestador, boolean estado) {
        this.idOrden = idOrden;
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.importe = importe;
        this.afiliado = afiliado;
        this.prestador = prestador;
        this.estado = estado;
    }

    public Orden(LocalDate fecha, String formaPago, double importe, Afiliado afiliado, Prestador prestador, boolean estado) {
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.importe = importe;
        this.afiliado = afiliado;
        this.prestador = prestador;
        this.estado = estado;
    }
    
    

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Orden{" + "idOrden=" + idOrden + ", fecha=" + fecha + ", formaPago=" + formaPago + ", importe=" + importe + ", afiliado=" + afiliado + ", prestador=" + prestador + ", estado=" + estado + '}';
    }
    
    
    
    
    
}
