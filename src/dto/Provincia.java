package dto;

public class Provincia {
    private String idProvincia;
    private String nombreProvincia;

    // Constructor
    public Provincia(String idProvincia, String nombreProvincia) {
        this.idProvincia = idProvincia;
        this.nombreProvincia = nombreProvincia;
    }

    // Getters y Setters
    public String getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(String idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }
}