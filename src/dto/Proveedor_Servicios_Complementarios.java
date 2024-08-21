package dto;

public class Proveedor_Servicios_Complementarios extends Contratado {
    private String ID_Contratado;
    private String Nombre_Proveedor;
    private String Dirección;
    private String Teléfono;
    private String Email;
    private String ID_Servicio;

    // Constructor
    public Proveedor_Servicios_Complementarios(String ID_Contratado, String codigoContrato, String idProvincia , String Nombre_Proveedor, String Dirección, String Teléfono, String Email, String ID_Servicio) {
        super(ID_Contratado, codigoContrato, idProvincia);
        setID_Contratado(ID_Contratado);
        setNombre_Proveedor(Nombre_Proveedor);
        setDirección(Dirección);
        setTeléfono(Teléfono);
        setEmail(Email);
        setID_Servicio(ID_Servicio);
    }

    // Getters and Setters
    public String getID_Contratado() {
        return ID_Contratado;
    }

    public void setID_Contratado(String ID_Contratado) {
        if (ID_Contratado == null || ID_Contratado.isEmpty()) {
            throw new IllegalArgumentException("El ID contratado no puede ser nulo o vacío.");
        }
        this.ID_Contratado = ID_Contratado;
    }

    public String getNombre_Proveedor() {
        return Nombre_Proveedor;
    }

    public void setNombre_Proveedor(String Nombre_Proveedor) {
        if (Nombre_Proveedor == null || Nombre_Proveedor.isEmpty()) {
            throw new IllegalArgumentException("El nombre del proveedor no puede ser nulo o vacío.");
        }
        this.Nombre_Proveedor = Nombre_Proveedor;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        if (Dirección == null || Dirección.isEmpty()) {
            throw new IllegalArgumentException("La dirección no puede ser nula o vacía.");
        }
        this.Dirección = Dirección;
    }

    public String getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(String Teléfono) {
        if (Teléfono == null || Teléfono.isEmpty()) {
            throw new IllegalArgumentException("El teléfono no puede ser nulo o vacío.");
        }
        this.Teléfono = Teléfono;
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
