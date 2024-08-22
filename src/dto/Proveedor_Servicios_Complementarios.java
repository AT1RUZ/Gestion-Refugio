package dto;

public class Proveedor_Servicios_Complementarios extends Contratado {
    private String ID_Contratado;
    private String Nombre_Proveedor;
    private String Direccion;
    private String Telefono;
    private String Email;
    private String ID_Servicio;

    // Constructor
    public Proveedor_Servicios_Complementarios(String ID_Contratado, String codigoContrato, String idProvincia , String Nombre_Proveedor, String Direccion, String Telefono, String Email, String ID_Servicio) {
        super(ID_Contratado, codigoContrato, idProvincia);
        setNombre_Proveedor(Nombre_Proveedor);
        setDireccion(Direccion);
        setTelefono(Telefono);
        setEmail(Email);
        setID_Servicio(ID_Servicio);
    }

    // Getters and Setters
    public String getNombre_Proveedor() {
        return Nombre_Proveedor;
    }

    public void setNombre_Proveedor(String Nombre_Proveedor) {
        if (Nombre_Proveedor == null || Nombre_Proveedor.isEmpty()) {
            throw new IllegalArgumentException("El nombre del proveedor no puede ser nulo o vacío.");
        }
        this.Nombre_Proveedor = Nombre_Proveedor;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        if (Direccion == null || Direccion.isEmpty()) {
            throw new IllegalArgumentException("La dirección no puede ser nula o vacía.");
        }
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        if (Telefono == null || Telefono.isEmpty()) {
            throw new IllegalArgumentException("El teléfono no puede ser nulo o vacío.");
        }
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        if (Email == null || Email.isEmpty()) {
            throw new IllegalArgumentException("El email no puede ser nulo o vacío.");
        }
        this.Email = Email;
    }

    public String getID_Servicio() {
        return ID_Servicio;
    }

    public void setID_Servicio(String ID_Servicio) {
        if (ID_Servicio == null || ID_Servicio.isEmpty()) {
            throw new IllegalArgumentException("El ID del servicio no puede ser nulo o vacío.");
        }
        this.ID_Servicio = ID_Servicio;
    }
}
