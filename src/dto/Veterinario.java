package dto;

public class Veterinario extends Contratado {
    private String idContratado;
    private String nombreVeterinario;
    private String clinicaVeterinario;
    private String direccionVeterinario;
    private String especialidadVeterinario;
    private String telefonoVeterinario;
    private String faxVeterinario;
    private String emailVeterinario;
    private String distanciaCiudadVeterinario;
    private String modalidadServicioVeterinario;

    // Constructor
    public Veterinario(String idContratado, String codigoContrato, String idProvincia, String nombreVeterinario, String clinicaVeterinario, String direccionVeterinario, String especialidadVeterinario, String telefonoVeterinario,String faxVeterinario, String emailVeterinario, String distanciaCiudadVeterinario,String modalidadServicioVeterinario) {
        super(idContratado, codigoContrato, idProvincia);
        setIdContratado(idContratado);
        setNombreVeterinario(nombreVeterinario);
        setClinicaVeterinario(clinicaVeterinario);
        setDireccionVeterinario(direccionVeterinario);
        setEspecialidadVeterinario(especialidadVeterinario);
        setTelefonoVeterinario(telefonoVeterinario);
        setFaxVeterinario(faxVeterinario);
        setEmailVeterinario(emailVeterinario);
        setDistanciaCiudadVeterinario(distanciaCiudadVeterinario);
        setModalidadServicioVeterinario(modalidadServicioVeterinario);
    }

    // Getters and Setters with validations
    public String getIdContratado() {
        return idContratado;
    }

    public void setIdContratado(String idContratado) {
        if (idContratado == null || idContratado.isEmpty()) {
            throw new IllegalArgumentException("El ID de contratado no puede ser nulo o vacío.");
        }
        this.idContratado = idContratado;
    }

    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

    public void setNombreVeterinario(String nombreVeterinario) {
        if (nombreVeterinario == null || nombreVeterinario.isEmpty()) {
            throw new IllegalArgumentException("El nombre del veterinario no puede ser nulo o vacío.");
        }
        this.nombreVeterinario = nombreVeterinario;
    }

    public String getClinicaVeterinario() {
        return clinicaVeterinario;
    }

    public void setClinicaVeterinario(String clinicaVeterinario) {
        if (clinicaVeterinario == null || clinicaVeterinario.isEmpty()) {
            throw new IllegalArgumentException("La clínica del veterinario no puede ser nula o vacía.");
        }
        this.clinicaVeterinario = clinicaVeterinario;
    }

    public String getDireccionVeterinario() {
        return direccionVeterinario;
    }

    public void setDireccionVeterinario(String direccionVeterinario) {
        if (direccionVeterinario == null || direccionVeterinario.isEmpty()) {
            throw new IllegalArgumentException("La dirección del veterinario no puede ser nula o vacía.");
        }
        this.direccionVeterinario = direccionVeterinario;
    }

    public String getEspecialidadVeterinario() {
        return especialidadVeterinario;
    }

    public void setEspecialidadVeterinario(String especialidadVeterinario) {
        if (especialidadVeterinario == null || especialidadVeterinario.isEmpty()) {
            throw new IllegalArgumentException("La especialidad del veterinario no puede ser nula o vacía.");
        }
        this.especialidadVeterinario = especialidadVeterinario;
    }

    public String getTelefonoVeterinario() {
        return telefonoVeterinario;
    }

    public void setTelefonoVeterinario(String telefonoVeterinario) {
        if (telefonoVeterinario == null || telefonoVeterinario.isEmpty()) {
            throw new IllegalArgumentException("El teléfono del veterinario no puede ser nulo o vacío.");
        }
        this.telefonoVeterinario = telefonoVeterinario;
    }

    public String getFaxVeterinario() {
        return faxVeterinario;
    }

    public void setFaxVeterinario(String faxVeterinario) {
        if (faxVeterinario == null || faxVeterinario.isEmpty()) {
            throw new IllegalArgumentException("El fax del veterinario no puede ser nulo o vacío.");
        }
        this.faxVeterinario = faxVeterinario;
    }

    public String getEmailVeterinario() {
        return emailVeterinario;
    }

    public void setEmailVeterinario(String emailVeterinario) {
        if (emailVeterinario == null || emailVeterinario.isEmpty()) {
            throw new IllegalArgumentException("El email del veterinario no puede ser nulo o vacío.");
        }
        if (!emailVeterinario.contains("@")) {
            throw new IllegalArgumentException("El email del veterinario debe contener '@'.");
        }
        this.emailVeterinario = emailVeterinario;
    }

    public String getDistanciaCiudadVeterinario() {
        return distanciaCiudadVeterinario;
    }

    public void setDistanciaCiudadVeterinario(String distanciaCiudadVeterinario) {
        if (distanciaCiudadVeterinario == null || distanciaCiudadVeterinario.isEmpty()) {
            throw new IllegalArgumentException("La distancia a la ciudad del veterinario no puede ser nula o vacía.");
        }
        this.distanciaCiudadVeterinario = distanciaCiudadVeterinario;
    }

    public String getModalidadServicioVeterinario() {
        return modalidadServicioVeterinario;
    }

    public void setModalidadServicioVeterinario(String modalidadServicioVeterinario) {
        if (modalidadServicioVeterinario == null || modalidadServicioVeterinario.isEmpty()) {
            throw new IllegalArgumentException("La modalidad de servicio del veterinario no puede ser nula o vacía.");
        }
        this.modalidadServicioVeterinario = modalidadServicioVeterinario;
    }
}
