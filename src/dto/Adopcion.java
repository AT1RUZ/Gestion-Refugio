package dto;

public class Adopcion {
    private String idAdopcion;
    private String idAnimal;
    private java.sql.Date fecha;
    private double costoAdopcion;
    private String nombreAdoptante;
    private String emailAdoptante;
    private String telefonoAdoptante;

    public Adopcion(String idAdopcion, String idAnimal, java.sql.Date fecha, double costoAdopcion, String nombreAdoptante, String emailAdoptante, String telefonoAdoptante) {
        setIdAdopcion(idAdopcion);
        setIdAnimal(idAnimal);
        setFecha(fecha);
        setCostoAdopcion(costoAdopcion);
        setNombreAdoptante(nombreAdoptante);
        setEmailAdoptante(emailAdoptante);
        setTelefonoAdoptante(telefonoAdoptante);
    }

    public String getIdAdopcion() {
        return idAdopcion;
    }

    public void setIdAdopcion(String idAdopcion) {
        if (idAdopcion == null || idAdopcion.isEmpty()) {
            throw new IllegalArgumentException("ID de adopción no puede ser nulo o vacío.");
        }
        this.idAdopcion = idAdopcion;
    }

    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    public java.sql.Date getFecha() {
        return fecha;
    }

    public void setFecha(java.sql.Date fecha) {
        this.fecha = fecha;
    }

    public double getCostoAdopcion() {
        return costoAdopcion;
    }

    public void setCostoAdopcion(double costoAdopcion) {
        if (costoAdopcion < 0) {
            throw new IllegalArgumentException("Costo de adopción no puede ser negativo.");
        }
        this.costoAdopcion = costoAdopcion;
    }

    public String getNombreAdoptante() {
        return nombreAdoptante;
    }

    public void setNombreAdoptante(String nombreAdoptante) {
        this.nombreAdoptante = nombreAdoptante;
    }

    public String getEmailAdoptante() {
        return emailAdoptante;
    }

    public void setEmailAdoptante(String emailAdoptante) {
        this.emailAdoptante = emailAdoptante;
    }

    public String getTelefonoAdoptante() {
        return telefonoAdoptante;
    }

    public void setTelefonoAdoptante(String telefonoAdoptante) {
        this.telefonoAdoptante = telefonoAdoptante;
    }
}

