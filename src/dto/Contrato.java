package dto;
import java.sql.Date;


public class Contrato {
    private String codigoContrato;
    private String nombre;
    private String tipoServicio;
    private String direccion;
    private String telefono;
    private String email;
    private String nombreResponsable;
    private Date fechaInicio;
    private Date fechaTerminacion;
    private Date fechaConciliacion;
    private String descripcion;

    public Contrato(String codigoContrato, String nombre, String tipoServicio, String direccion,
                     String telefono, String email, String nombreResponsable, Date fechaInicio,
                     Date fechaTerminacion, Date fechaConciliacion, String descripcion) {
        setCodigoContrato(codigoContrato);
        setNombre(nombre);
        setTipoServicio(tipoServicio);
        setDireccion(direccion);
        setTelefono(telefono);
        setEmail(email);
        setNombreResponsable(nombreResponsable);
        setFechaInicio(fechaInicio);
        setFechaTerminacion(fechaTerminacion);
        setFechaConciliacion(fechaConciliacion);
        setDescripcion(descripcion);
    }

    // Getters and Setters with validations
    public String getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(String codigoContrato) {
        if (codigoContrato == null || codigoContrato.isEmpty()) {
            throw new IllegalArgumentException("Código de contrato no puede ser nulo o vacío");
        }
        this.codigoContrato = codigoContrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre no puede ser nulo o vacío");
        }
        this.nombre = nombre;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        if (tipoServicio == null || tipoServicio.isEmpty()) {
            throw new IllegalArgumentException("Tipo de servicio no puede ser nulo o vacío");
        }
        this.tipoServicio = tipoServicio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.isEmpty()) {
            throw new IllegalArgumentException("Dirección no puede ser nula o vacía");
        }
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.isEmpty()) {
            throw new IllegalArgumentException("Teléfono no puede ser nulo o vacío");
        }
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email no puede ser nulo o vacío");
        }
        this.email = email;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        if (nombreResponsable == null || nombreResponsable.isEmpty()) {
            throw new IllegalArgumentException("Nombre del responsable no puede ser nulo o vacío");
        }
        this.nombreResponsable = nombreResponsable;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        if (fechaInicio == null) {
            throw new IllegalArgumentException("Fecha de inicio no puede ser nula");
        }
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTerminacion() {
        return fechaTerminacion;
    }

    public void setFechaTerminacion(Date fechaTerminacion) {
        if (fechaTerminacion == null) {
            throw new IllegalArgumentException("Fecha de terminación no puede ser nula");
        }
        this.fechaTerminacion = fechaTerminacion;
    }

    public Date getFechaConciliacion() {
        return fechaConciliacion;
    }

    public void setFechaConciliacion(Date fechaConciliacion) {
        this.fechaConciliacion = fechaConciliacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.isEmpty()) {
            throw new IllegalArgumentException("Descripción no puede ser nula o vacía");
        }
        this.descripcion = descripcion;
    }
}
