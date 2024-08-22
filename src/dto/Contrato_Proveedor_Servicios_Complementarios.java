package dto;

import java.sql.Date;

public class Contrato_Proveedor_Servicios_Complementarios {
    private Date fechaInicioContrato;
    private Date fechaTerminacionContrato;
    private Date fechaConciliacion;
    private String descripcionContrato;
    private String tipoServicio;
    private String provincia;

    // Getters y Setters

    public Date getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(Date fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public Date getFechaTerminacionContrato() {
        return fechaTerminacionContrato;
    }

    public void setFechaTerminacionContrato(Date fechaTerminacionContrato) {
        this.fechaTerminacionContrato = fechaTerminacionContrato;
    }

    public Date getFechaConciliacion() {
        return fechaConciliacion;
    }

    public void setFechaConciliacion(Date fechaConciliacion) {
        this.fechaConciliacion = fechaConciliacion;
    }

    public String getDescripcionContrato() {
        return descripcionContrato;
    }

    public void setDescripcionContrato(String descripcionContrato) {
        this.descripcionContrato = descripcionContrato;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
