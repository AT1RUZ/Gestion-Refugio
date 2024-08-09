package dto;
import java.time.LocalDate;

public class Contrato {
    private String codigoContrato;
    private String nombre;
    private String tipoServicio;
    private String direccion;
    private String telefono;
    private String email;
    private String nombreResponsable;
    private LocalDate fechaInicio;
    private LocalDate fechaTerminacion;
    private LocalDate fechaConciliacion;
    private String descripcion;

    // Constructor
    public Contrato(String codigoContrato, String nombre, String tipoServicio, String direccion, String telefono, String email, String nombreResponsable, LocalDate fechaInicio, LocalDate fechaTerminacion, LocalDate fechaConciliacion, String descripcion) {
        this.codigoContrato = codigoContrato;
        this.nombre = nombre;
        this.tipoServicio = tipoServicio;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.nombreResponsable = nombreResponsable;
        this.fechaInicio = fechaInicio;
        this.fechaTerminacion = fechaTerminacion;
        this.fechaConciliacion = fechaConciliacion;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(String codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email no válido.");
        }
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaTerminacion() {
        return fechaTerminacion;
    }

    public void setFechaTerminacion(LocalDate fechaTerminacion) {
        this.fechaTerminacion = fechaTerminacion;
    }

    public LocalDate getFechaConciliacion() {
        return fechaConciliacion;
    }

    public void setFechaConciliacion(LocalDate fechaConciliacion) {
        this.fechaConciliacion = fechaConciliacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}