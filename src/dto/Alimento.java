package dto;

public class Alimento {
    private String idAlimento;
    private String nombreAlimento;

    // Constructor
    public Alimento(String idAlimento, String nombreAlimento) {
        this.idAlimento = idAlimento;
        this.nombreAlimento = nombreAlimento;
    }

    // Getters y Setters
    public String getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(String idAlimento) {
        this.idAlimento = idAlimento;
    }

    public String getNombreAlimento() {
        return nombreAlimento;
    }

    public void setNombreAlimento(String nombreAlimento) {
        this.nombreAlimento = nombreAlimento;
    }
}
