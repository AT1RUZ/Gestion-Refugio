package dto;

public class Contrato_Veterinario {
    private String nombreVeterinario;
    private String clinicaVeterinario;
    private String idProvincia;
    private String direccionVeterinario;
    private String especialidadVeterinario;
    private java.sql.Date fechaInicio;
    private java.sql.Date fechaTerminacion;
    private java.sql.Date fechaConciliacion;
    private String descripcion;

    // Constructor
    public Contrato_Veterinario(String nombreVeterinario, String clinicaVeterinario, String idProvincia,
                               String direccionVeterinario, String especialidadVeterinario,
                               java.sql.Date fechaInicio, java.sql.Date fechaTerminacion,
                               java.sql.Date fechaConciliacion, String descripcion) {
        this.nombreVeterinario = nombreVeterinario;
        this.clinicaVeterinario = clinicaVeterinario;
        this.idProvincia = idProvincia;
        this.direccionVeterinario = direccionVeterinario;
        this.especialidadVeterinario = especialidadVeterinario;
        this.fechaInicio = fechaInicio;
        this.fechaTerminacion = fechaTerminacion;
        this.fechaConciliacion = fechaConciliacion;
        this.descripcion = descripcion;
    }

    // Getters
    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

    public String getClinicaVeterinario() {
        return clinicaVeterinario;
    }

    public String getIdProvincia() {
        return idProvincia;
    }

    public String getDireccionVeterinario() {
        return direccionVeterinario;
    }

    public String getEspecialidadVeterinario() {
        return especialidadVeterinario;
    }

    public java.sql.Date getFechaInicio() {
        return fechaInicio;
    }

    public java.sql.Date getFechaTerminacion() {
        return fechaTerminacion;
    }

    public java.sql.Date getFechaConciliacion() {
        return fechaConciliacion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
