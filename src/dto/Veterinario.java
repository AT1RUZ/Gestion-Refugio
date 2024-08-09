package dto;

public class Veterinario {
    private String idVeterinario;
    private String nombreVeterinario;
    private String clinicaVeterinario;
    private String direccionVeterinario;
    private String especialidadVeterinario;
    private String telefonoVeterinario;
    private String faxVeterinario;
    private String emailVeterinario;
    private String distanciaCiudadVeterinario;
    private String modalidadServicioVeterinario;
    private String codigoContrato;
    private String idProvincia;

    // Constructor
    public Veterinario(String idVeterinario, String nombreVeterinario, String clinicaVeterinario, String direccionVeterinario, String especialidadVeterinario, String telefonoVeterinario, String faxVeterinario, String emailVeterinario, String distanciaCiudadVeterinario, String modalidadServicioVeterinario, String codigoContrato, String idProvincia) {
        this.idVeterinario = idVeterinario;
        this.nombreVeterinario = nombreVeterinario;
        this.clinicaVeterinario = clinicaVeterinario;
        this.direccionVeterinario = direccionVeterinario;
        this.especialidadVeterinario = especialidadVeterinario;
        this.telefonoVeterinario = telefonoVeterinario;
        this.faxVeterinario = faxVeterinario;
        this.emailVeterinario = emailVeterinario;
        this.distanciaCiudadVeterinario = distanciaCiudadVeterinario;
        this.modalidadServicioVeterinario = modalidadServicioVeterinario;
        this.codigoContrato = codigoContrato;
        this.idProvincia = idProvincia;
    }

    // Getters y Setters
    public String getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(String idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

    public void setNombreVeterinario(String nombreVeterinario) {
        this.nombreVeterinario = nombreVeterinario;
    }

    public String getClinicaVeterinario() {
        return clinicaVeterinario;
    }

    public void setClinicaVeterinario(String clinicaVeterinario) {
        this.clinicaVeterinario = clinicaVeterinario;
    }

    public String getDireccionVeterinario() {
        return direccionVeterinario;
    }

    public void setDireccionVeterinario(String direccionVeterinario) {
        this.direccionVeterinario = direccionVeterinario;
    }

    public String getEspecialidadVeterinario() {
        return especialidadVeterinario;
    }

    public void setEspecialidadVeterinario(String especialidadVeterinario) {
        this.especialidadVeterinario = especialidadVeterinario;
    }

    public String getTelefonoVeterinario() {
        return telefonoVeterinario;
    }

    public void setTelefonoVeterinario(String telefonoVeterinario) {
        this.telefonoVeterinario = telefonoVeterinario;
    }

    public String getFaxVeterinario() {
        return faxVeterinario;
    }

    public void setFaxVeterinario(String faxVeterinario) {
        this.faxVeterinario = faxVeterinario;
    }

    public String getEmailVeterinario() {
        return emailVeterinario;
    }

    public void setEmailVeterinario(String emailVeterinario) {
        if (emailVeterinario.contains("@")) {
            this.emailVeterinario = emailVeterinario;
        } else {
            throw new IllegalArgumentException("Email no válido.");
        }
    }

    public String getDistanciaCiudadVeterinario() {
        return distanciaCiudadVeterinario;
    }

    public void setDistanciaCiudadVeterinario(String distanciaCiudadVeterinario) {
        this.distanciaCiudadVeterinario = distanciaCiudadVeterinario;
    }

    public String getModalidadServicioVeterinario() {
        return modalidadServicioVeterinario;
    }

    public void setModalidadServicioVeterinario(String modalidadServicioVeterinario) {
        this.modalidadServicioVeterinario = modalidadServicioVeterinario;
    }

    public String getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(String codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public String getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(String idProvincia) {
        this.idProvincia = idProvincia;
    }
}