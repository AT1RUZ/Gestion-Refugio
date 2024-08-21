package dto;

public class Animal {
    private String idAnimal;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private double peso;
    private int diasRefugio;
    private double precioMantenimiento;
    private double precioAdopcion;

    // Constructor
    public Animal(String idAnimal, String nombre, String especie, String raza, int edad, double peso, int diasRefugio, double precioMantenimiento, double precioAdopcion) {
        setIdAnimal(idAnimal);
        setNombre(nombre);
        setEspecie(especie);
        setRaza(raza);
        setEdad(edad);
        setPeso(peso);
        setDiasRefugio(diasRefugio);
        setPrecioMantenimiento(precioMantenimiento);
        setPrecioAdopcion(precioAdopcion);
    }

    // Getters and Setters
    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        if (idAnimal == null || idAnimal.isEmpty()) {
            throw new IllegalArgumentException("ID de animal no puede ser nulo o vacío.");
        }
        this.idAnimal = idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.isEmpty()) {
            throw new IllegalArgumentException("Especie no puede ser nula o vacía.");
        }
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if (raza == null || raza.isEmpty()) {
            throw new IllegalArgumentException("Raza no puede ser nula o vacía.");
        }
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad <= 0) {
            throw new IllegalArgumentException("Edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso no puede ser negativo.");
        }
        this.peso = peso;
    }

    public int getDiasRefugio() {
        return diasRefugio;
    }

    public void setDiasRefugio(int diasRefugio) {
        if (diasRefugio <= 0) {
            throw new IllegalArgumentException("Días en refugio no pueden ser negativos.");
        }
        this.diasRefugio = diasRefugio;
    }

    public double getPrecioMantenimiento() {
        return precioMantenimiento;
    }

    public void setPrecioMantenimiento(double precioMantenimiento) {
        if (precioMantenimiento <= 0) {
            throw new IllegalArgumentException("Precio de mantenimiento no puede ser negativo.");
        }
        this.precioMantenimiento = precioMantenimiento;
    }

    public double getPrecioAdopcion() {
        return precioAdopcion;
    }

    public void setPrecioAdopcion(double precioAdopcion) {
        if (precioAdopcion <= 0) {
            throw new IllegalArgumentException("Precio de adopción no puede ser negativo.");
        }
        this.precioAdopcion = precioAdopcion;
    }
}
