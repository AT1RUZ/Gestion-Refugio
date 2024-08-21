package dto;

public class Provincia {
    private String idProvincia;
    private String nombreProvincia;

    // Constructor
    public Provincia(String idProvincia, String nombreProvincia) {
        setIdProvincia(idProvincia);
        setNombreProvincia(nombreProvincia);
    }

    // Getters y Setters con validaciones
    public String getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(String idProvincia) {
        if (idProvincia == null || idProvincia.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID de la provincia no puede ser nulo o vacío.");
        }
        this.idProvincia = idProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        if (nombreProvincia == null || nombreProvincia.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la provincia no puede ser nulo o vacío.");
        }
        this.nombreProvincia = nombreProvincia;
    }
}