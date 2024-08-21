package dto;

public class Tipo_Alimento {
    private String idAlimento;
    private String nombreAlimento;

    // Constructor
    public Tipo_Alimento(String idAlimento, String nombreAlimento) {
        setIdAlimento(idAlimento);
        setNombreAlimento(nombreAlimento);
    }

    // Getters y Setters con validaciones
    public String getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(String idAlimento) {
        if (idAlimento == null || idAlimento.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID del alimento no puede ser nulo o vacío.");
        }
        this.idAlimento = idAlimento;
    }

    public String getNombreAlimento() {
        return nombreAlimento;
    }

    public void setNombreAlimento(String nombreAlimento) {
        if (nombreAlimento == null || nombreAlimento.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del alimento no puede ser nulo o vacío.");
        }
        this.nombreAlimento = nombreAlimento;
    }
}