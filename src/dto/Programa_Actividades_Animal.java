package dto;

public class Programa_Actividades_Animal {
    private String nombreAnimal;
    private String especie;
    private String raza;
    private int edad;
    private double peso;
    private int diasRefugio;
    private String dia;
    private String hora;
    private String descripcionActividad;
    private double precioActividad;
    private String nombreVeterinario;
    private String tipoAlimento;
    private double precioTotalCuidadoVeterinario;
    private double precioTransporte;
    private double precioTotalMantenimiento;

    // Constructor
    public Programa_Actividades_Animal(String nombreAnimal, String especie, String raza, int edad, double peso, int diasRefugio, String dia, String hora, String descripcionActividad, double precioActividad, String nombreVeterinario, String tipoAlimento, double precioTotalCuidadoVeterinario, double precioTransporte, double precioTotalMantenimiento) {
        this.nombreAnimal = nombreAnimal;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.diasRefugio = diasRefugio;
        this.dia = dia;
        this.hora = hora;
        this.descripcionActividad = descripcionActividad;
        this.precioActividad = precioActividad;
        this.nombreVeterinario = nombreVeterinario;
        this.tipoAlimento = tipoAlimento;
        this.precioTotalCuidadoVeterinario = precioTotalCuidadoVeterinario;
        this.precioTransporte = precioTransporte;
        this.precioTotalMantenimiento = precioTotalMantenimiento;
    }

    // Getters y Setters
    public String getNombreAnimal() { return nombreAnimal; }
    public void setNombreAnimal(String nombreAnimal) { this.nombreAnimal = nombreAnimal; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public int getDiasRefugio() { return diasRefugio; }
    public void setDiasRefugio(int diasRefugio) { this.diasRefugio = diasRefugio; }

    public String getDia() { return dia; }
    public void setDia(String dia) { this.dia = dia; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public String getDescripcionActividad() { return descripcionActividad; }
    public void setDescripcionActividad(String descripcionActividad) { this.descripcionActividad = descripcionActividad; }

    public double getPrecioActividad() { return precioActividad; }
    public void setPrecioActividad(double precioActividad) { this.precioActividad = precioActividad; }

    public String getNombreVeterinario() { return nombreVeterinario; }
    public void setNombreVeterinario(String nombreVeterinario) { this.nombreVeterinario = nombreVeterinario; }

    public String getTipoAlimento() { return tipoAlimento; }
    public void setTipoAlimento(String tipoAlimento) { this.tipoAlimento = tipoAlimento; }

    public double getPrecioTotalCuidadoVeterinario() { return precioTotalCuidadoVeterinario; }
    public void setPrecioTotalCuidadoVeterinario(double precioTotalCuidadoVeterinario) { this.precioTotalCuidadoVeterinario = precioTotalCuidadoVeterinario; }

    public double getPrecioTransporte() { return precioTransporte; }
    public void setPrecioTransporte(double precioTransporte) { this.precioTransporte = precioTransporte; }

    public double getPrecioTotalMantenimiento() { return precioTotalMantenimiento; }
    public void setPrecioTotalMantenimiento(double precioTotalMantenimiento) { this.precioTotalMantenimiento = precioTotalMantenimiento; }
}