package dto;

public class Veterinario_Activo {
    private java.sql.Date fecha;
    private String nombreVeterinario;
    private String clinicaVeterinario;
    private String provincia;
    private String especialidadVeterinario;
    private String telefono;
    private String fax;
    private String correoElectronico;
    private String distanciaCiudad;
    private String modalidadesServicio;

    // Constructor
    public Veterinario_Activo(java.sql.Date fecha, String nombreVeterinario, String clinicaVeterinario,
                             String provincia, String especialidadVeterinario, String telefono, String fax,
                             String correoElectronico, String distanciaCiudad, String modalidadesServicio) {
        this.fecha = fecha;
        this.nombreVeterinario = nombreVeterinario;
        this.clinicaVeterinario = clinicaVeterinario;
        this.provincia = provincia;
        this.especialidadVeterinario = especialidadVeterinario;
        this.telefono = telefono;
        this.fax = fax;
        this.correoElectronico = correoElectronico;
        this.distanciaCiudad = distanciaCiudad;
        this.modalidadesServicio = modalidadesServicio;
    }

    // Getters
    public java.sql.Date getFecha() {
        return fecha;
    }

    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

    public String getClinicaVeterinario() {
        return clinicaVeterinario;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getEspecialidadVeterinario() {
        return especialidadVeterinario;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFax() {
        return fax;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getDistanciaCiudad() {
        return distanciaCiudad;
    }

    public String getModalidadesServicio() {
        return modalidadesServicio;
    }
}
