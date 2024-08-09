package dto;

public class Servicio {
    private String idServicio;
    private String nombreServicio;

    // Constructor
    public Servicio(String idServicio, String nombreServicio) {
        this.idServicio = idServicio;
        this.nombreServicio = nombreServicio;
    }

    // Getters y Setters
    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }
}
