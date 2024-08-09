package dto;

public class Proveedor_Alimentos {
    private String idProveedorAlimentos;
    private String nombreProveedor;
    private String direccion;
    private String email;
    private String codigoContrato;
    private String idAlimento;
    private String idProvincia;

    // Constructor
    public Proveedor_Alimentos(String idProveedorAlimentos, String nombreProveedor, String direccion, String email, String codigoContrato, String idAlimento, String idProvincia) {
        this.idProveedorAlimentos = idProveedorAlimentos;
        this.nombreProveedor = nombreProveedor;
        this.direccion = direccion;
        this.email = email;
        this.codigoContrato = codigoContrato;
        this.idAlimento = idAlimento;
        this.idProvincia = idProvincia;
    }

    // Getters y Setters
    public String getIdProveedorAlimentos() {
        return idProveedorAlimentos;
    }

    public void setIdProveedorAlimentos(String idProveedorAlimentos) {
        this.idProveedorAlimentos = idProveedorAlimentos;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email no válido.");
        }
    }

    public String getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(String codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public String getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(String idAlimento) {
        this.idAlimento = idAlimento;
    }

    public String getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(String idProvincia) {
        this.idProvincia = idProvincia;
    }
}