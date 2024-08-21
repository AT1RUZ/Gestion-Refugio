package dto;

public class Contratado {
    protected String idContratado;
    protected String codigoContrato;
    protected String idProvincia;

    // Constructor
    public Contratado(String idContratado, String codigoContrato, String idProvincia) {
        setIdContratado(idContratado);
        setCodigoContrato(codigoContrato);
        setIdProvincia(idProvincia);
    }

    // Getters and Setters
    public String getIdContratado() {
        return idContratado;
    }

    public void setIdContratado(String idContratado) {
        if (idContratado == null || idContratado.isEmpty()) {
            throw new IllegalArgumentException("ID de contratado no puede ser nulo o vacío.");
        }
        this.idContratado = idContratado;
    }

    public String getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(String codigoContrato) {
        if (codigoContrato == null || codigoContrato.isEmpty()) {
            throw new IllegalArgumentException("Código de contrato no puede ser nulo o vacío.");
        }
        this.codigoContrato = codigoContrato;
    }

    public String getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(String idProvincia) {
        if (idProvincia == null || idProvincia.isEmpty()) {
            throw new IllegalArgumentException("ID de provincia no puede ser nulo o vacío.");
        }
        this.idProvincia = idProvincia;
    }
}

