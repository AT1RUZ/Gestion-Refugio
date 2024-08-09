package dto;

public class Animal {
    private String idAnimal;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private float peso;
    private int diasRefugio;
    private float precioMantenimiento;
    private float precioAdopcion;

    // Constructor
    public Animal(String idAnimal, String nombre, String especie, String raza, int edad, float peso, int diasRefugio, float precioMantenimiento, float precioAdopcion) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.diasRefugio = diasRefugio;
        this.precioMantenimiento = precioMantenimiento;
        this.precioAdopcion = precioAdopcion;
    }

    // Getters y Setters
    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        if (edad >= 0) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if (peso >= 0) {
            this.peso = peso;
        } else {
            throw new IllegalArgumentException("El peso no puede ser negativo.");
        }
    }

    public int getDiasRefugio() {
        return diasRefugio;
    }

    public void setDiasRefugio(int diasRefugio) {
        if (diasRefugio >= 0) {
            this.diasRefugio = diasRefugio;
        } else {
            throw new IllegalArgumentException("Los días en refugio no pueden ser negativos.");
        }
    }

    public float getPrecioMantenimiento() {
        return precioMantenimiento;
    }

    public void setPrecioMantenimiento(float precioMantenimiento) {
        if (precioMantenimiento >= 0) {
            this.precioMantenimiento = precioMantenimiento;
        } else {
            throw new IllegalArgumentException("El precio de mantenimiento no puede ser negativo.");
        }
    }

    public float getPrecioAdopcion() {
        return precioAdopcion;
    }

    public void setPrecioAdopcion(float precioAdopcion) {
        if (precioAdopcion >= 0) {
            this.precioAdopcion = precioAdopcion;
        } else {
            throw new IllegalArgumentException("El precio de adopción no puede ser negativo.");
        }
    }
}