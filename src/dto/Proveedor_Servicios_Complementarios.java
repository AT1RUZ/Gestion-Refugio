package dto;

public class Proveedor_Servicios_Complementarios {
    private String idProveedorServiciosComplementarios;
    private String nombreProveedor;
    private String direccion;
    private String telefono;
    private String email;
    private String codigoContrato;
    private String idProvincia;

    // Constructor
    public Proveedor_Servicios_Complementarios(String idProveedorServiciosComplementarios, String nombreProveedor, String direccion, String telefono, String email, String codigoContrato, String idProvincia) {
        this.idProveedorServiciosComplementarios = idProveedorServiciosComplementarios;
        this.nombreProveedor = nombreProveedor;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.codigoContrato = codigoContrato;
        this.idProvincia = idProvincia;
    }

    // Getters y Setters
    public String getIdProveedorServiciosComplementarios() {
        return idProveedorServiciosComplementarios;
    }

    public void setIdProveedorServiciosComplementarios(String idProveedorServiciosComplementarios) {
        this.idProveedorServiciosComplementarios = idProveedorServiciosComplementarios;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public String getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(String idProvincia) {
        this.idProvincia = idProvincia;
    }
}