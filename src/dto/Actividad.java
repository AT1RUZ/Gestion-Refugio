package dto;
import java.sql.*;
public class Actividad {
    private String idActividad;
    private String descripcionActividad;
    private double precio;
    private double precioTransporte;
    private String idAnimal;
    private String idContratadoVeterinario;
    private String idContratadoProveedorAlimentos;
    private String idContratadoProveedorServiciosComplementarios;
    private String idTransporte;
    private Date dia;
    private Time hora;

    public Actividad(String idActividad, String descripcionActividad, double precio, double precioTransporte,String idAnimal, String idContratadoVeterinario, String idContratadoProveedorAlimentos,
                     String idContratadoProveedorServiciosComplementarios, String idTransporte,Date dia, Time hora) {
        setIdActividad(idActividad);
        setDescripcionActividad(descripcionActividad);
        setPrecio(precio);
        setPrecioTransporte(precioTransporte);
        setIdAnimal(idAnimal);
        setIdContratadoVeterinario(idContratadoVeterinario);
        setIdContratadoProveedorAlimentos(idContratadoProveedorAlimentos);
        setIdContratadoProveedorServiciosComplementarios(idContratadoProveedorServiciosComplementarios);
        setIdTransporte(idTransporte);
        setDia(dia);
        setHora(hora);
    }

    public String getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(String idActividad) {
        if (idActividad == null || idActividad.isEmpty()) {
            throw new IllegalArgumentException("ID de actividad no puede ser nulo o vacío.");
        }
        this.idActividad = idActividad;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        if (descripcionActividad == null || descripcionActividad.isEmpty()) {
            throw new IllegalArgumentException("Descripcion actividad no puede estar vacio");
        }
        this.descripcionActividad = descripcionActividad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("Precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    public double getPrecioTransporte() {
        return precioTransporte;
    }

    public void setPrecioTransporte(double precioTransporte) {
        if (precioTransporte <= 0) {
            throw new IllegalArgumentException("Precio de transporte no puede ser negativo.");
        }
        this.precioTransporte = precioTransporte;
    }

    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getIdContratadoVeterinario() {
        return idContratadoVeterinario;
    }

    public void setIdContratadoVeterinario(String idContratadoVeterinario) {
        this.idContratadoVeterinario = idContratadoVeterinario;
    }

    public String getIdContratadoProveedorAlimentos() {
        return idContratadoProveedorAlimentos;
    }

    public void setIdContratadoProveedorAlimentos(String idContratadoProveedorAlimentos) {
        this.idContratadoProveedorAlimentos = idContratadoProveedorAlimentos;
    }

    public String getIdContratadoProveedorServiciosComplementarios() {
        return idContratadoProveedorServiciosComplementarios;
    }

    public void setIdContratadoProveedorServiciosComplementarios(String idContratadoProveedorServiciosComplementarios) {
        this.idContratadoProveedorServiciosComplementarios = idContratadoProveedorServiciosComplementarios;
    }

    public String getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(String idTransporte) {
        this.idTransporte = idTransporte;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
}
