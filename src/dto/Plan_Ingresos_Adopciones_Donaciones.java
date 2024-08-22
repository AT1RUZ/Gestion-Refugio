package dto;

public class Plan_Ingresos_Adopciones_Donaciones {
    private String nombreAnimal;
    private String especie;
    private String raza;
    private int edad;
    private double costoTotalMantenimiento;
    private double precioTotalAdopcion;
    private double donacionesRecibidas;
    private double montoTotalIngresos;

    // Constructor
    public Plan_Ingresos_Adopciones_Donaciones(String nombreAnimal, String especie, String raza, int edad,
                                       double costoTotalMantenimiento, double precioTotalAdopcion,
                                       double donacionesRecibidas, double montoTotalIngresos) {
        this.nombreAnimal = nombreAnimal;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.costoTotalMantenimiento = costoTotalMantenimiento;
        this.precioTotalAdopcion = precioTotalAdopcion;
        this.donacionesRecibidas = donacionesRecibidas;
        this.montoTotalIngresos = montoTotalIngresos;
    }

    // Getters and Setters
    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCostoTotalMantenimiento() {
        return costoTotalMantenimiento;
    }

    public void setCostoTotalMantenimiento(double costoTotalMantenimiento) {
        this.costoTotalMantenimiento = costoTotalMantenimiento;
    }

    public double getPrecioTotalAdopcion() {
        return precioTotalAdopcion;
    }

    public void setPrecioTotalAdopcion(double precioTotalAdopcion) {
        this.precioTotalAdopcion = precioTotalAdopcion;
    }

    public double getDonacionesRecibidas() {
        return donacionesRecibidas;
    }

    public void setDonacionesRecibidas(double donacionesRecibidas) {
        this.donacionesRecibidas = donacionesRecibidas;
    }

    public double getMontoTotalIngresos() {
        return montoTotalIngresos;
    }

    public void setMontoTotalIngresos(double montoTotalIngresos) {
        this.montoTotalIngresos = montoTotalIngresos;
    }

    @Override
    public String toString() {
        return "IngresoAdopcionesDonaciones{" +
                "nombreAnimal='" + nombreAnimal + '\'' +
                ", especie='" + especie + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", costoTotalMantenimiento=" + costoTotalMantenimiento +
                ", precioTotalAdopcion=" + precioTotalAdopcion +
                ", donacionesRecibidas=" + donacionesRecibidas +
                ", montoTotalIngresos=" + montoTotalIngresos +
                '}';
    }
}
