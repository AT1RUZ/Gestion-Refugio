package dto;

public class Actividad {
    private String idActividad;
    private String descripcionActividad;
    private float precio;
    private float precioTransporte;
    private String idAnimal;
    private String idVeterinario;
    private String idProveedorAlimentos;
    private String idProveedorServiciosComplementarios;
    private String idTransporte;

    // Constructor
    public Actividad(String idActividad, String descripcionActividad, float precio, float precioTransporte, String idAnimal, String idVeterinario, String idProveedorAlimentos, String idProveedorServiciosComplementarios, String idTransporte) {
        this.idActividad = idActividad;
        this.descripcionActividad = descripcionActividad;
        this.precio = precio;
        this.precioTransporte = precioTransporte;
        this.idAnimal = idAnimal;
        this.idVeterinario = idVeterinario;
        this.idProveedorAlimentos = idProveedorAlimentos;
        this.idProveedorServiciosComplementarios = idProveedorServiciosComplementarios;
        this.idTransporte = idTransporte;
    }

    // Getters y Setters
    public String getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(String idActividad) {
        this.idActividad = idActividad;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
    }

    public float getPrecioTransporte() {
        return precioTransporte;
    }

    public void setPrecioTransporte(float precioTransporte) {
        if (precioTransporte >= 0) {
            this.precioTransporte = precioTransporte;
        } else {
            throw new IllegalArgumentException("El precio de transporte no puede ser negativo.");
        }
    }

    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(String idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public String getIdProveedorAlimentos() {
        return idProveedorAlimentos;
    }

    public void setIdProveedorAlimentos(String idProveedorAlimentos) {
        this.idProveedorAlimentos = idProveedorAlimentos;
    }

    public String getIdProveedorServiciosComplementarios() {
        return idProveedorServiciosComplementarios;
    }

    public void setIdProveedorServiciosComplementarios(String idProveedorServiciosComplementarios) {
        this.idProveedorServiciosComplementarios = idProveedorServiciosComplementarios;
    }

    public String getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(String idTransporte) {
        this.idTransporte = idTransporte;
    }
}