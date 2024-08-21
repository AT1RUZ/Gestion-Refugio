package dto;

public class Transporte {
    private String idTransporte;
    private String vehiculo;
    private String modalidad;
    private float precio;

    // Constructor
    public Transporte(String idTransporte, String vehiculo, String modalidad, float precio) {
        setIdTransporte(idTransporte);
        setVehiculo(vehiculo);
        setModalidad(modalidad);
        setPrecio(precio);
    }

    // Getters y Setters
    public String getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(String idTransporte) {
        this.idTransporte = idTransporte;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
    }
}