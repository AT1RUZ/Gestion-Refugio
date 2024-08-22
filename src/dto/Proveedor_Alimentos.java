package dto;

public class Proveedor_Alimentos extends Contratado {
    private String nombreProveedor;
    private String direccion;
    private String email;
    private String idAlimento;

    // Constructor
    public Proveedor_Alimentos(String idContratado, String codigoContrato, String idProvincia, String nombreProveedor, String direccion, String email, String idAlimento) {
        super(idContratado, codigoContrato, idProvincia);
        setIdContratado(idContratado);
        setNombreProveedor(nombreProveedor);
        setDireccion(direccion);
        setEmail(email);
        setIdAlimento(idAlimento);
    }

    // Getters y Setters con validaciones
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        if (nombreProveedor == null || nombreProveedor.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del proveedor no puede ser nulo o vacío.");
        }
        this.nombreProveedor = nombreProveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La dirección no puede ser nula o vacía.");
        }
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.matches("^(.+)@(.+)$")) {
            throw new IllegalArgumentException("El email no es válido.");
        }
        this.email = email;
    }

    public String getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(String idAlimento) {
        if (idAlimento == null || idAlimento.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID del alimento no puede ser nulo o vacío.");
        }
        this.idAlimento = idAlimento;
    }
}