package dto;

public class Tipo_Servicio {
    private String idServicio;
    private String nombreServicio;

    // Constructor
    public Tipo_Servicio(String idServicio, String nombreServicio) {
        setIdServicio(idServicio);
        setNombreServicio(nombreServicio);
    }

    // Getters y Setters con validaciones
    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        if (idServicio == null || idServicio.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID del servicio no puede ser nulo o vacío.");
        }
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        if (nombreServicio == null || nombreServicio.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del servicio no puede ser nulo o vacío.");
        }
        this.nombreServicio = nombreServicio;
    }
}