package dto;
import java.sql.Date;

public class Donacion {
    private String ID_Donacion;
    private double Monto;
    private Date Fecha;
    private String Nombre_Donante;
    private String Email_Donante;
    private String Telefono_Donante;
    private String ID_Animal;

    // Constructor
    public Donacion(String ID_Donacion, double Monto, Date Fecha, String Nombre_Donante, String Email_Donante, String Telefono_Donante, String ID_Animal) {
        setID_Donacion(ID_Donacion);
        setMonto(Monto);
        setFecha(Fecha);
        setNombre_Donante(Nombre_Donante);
        setEmail_Donante(Email_Donante);
        setTelefono_Donante(Telefono_Donante);
        setID_Animal(ID_Animal);
    }

    // Getters and Setters

    public String getID_Animal(){
        return ID_Animal;
    }

    public void setID_Animal(String ID_Animal) {
        if(ID_Animal == null || ID_Animal.isEmpty())
            throw new IllegalArgumentException("El ID del animal no puede estar vacio");
        this.ID_Animal = ID_Animal;
    }

    public String getID_Donacion() {
        return ID_Donacion;
    }

    public void setID_Donacion(String ID_Donacion) {
        if (ID_Donacion == null || ID_Donacion.isEmpty()) {
            throw new IllegalArgumentException("El ID de la donación no puede ser nulo o vacío.");
        }
        this.ID_Donacion = ID_Donacion;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        if (Monto < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo.");
        }
        this.Monto = Monto;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        if (Fecha == null) {
            throw new IllegalArgumentException("La fecha no puede ser nula.");
        }
        this.Fecha = Fecha;
    }

    public String getNombre_Donante() {
        return Nombre_Donante;
    }

    public void setNombre_Donante(String Nombre_Donante) {
        if (Nombre_Donante == null || Nombre_Donante.isEmpty()) {
            throw new IllegalArgumentException("El nombre del donante no puede ser nulo o vacío.");
        }
        this.Nombre_Donante = Nombre_Donante;
    }

    public String getEmail_Donante() {
        return Email_Donante;
    }

    public void setEmail_Donante(String Email_Donante) {
        if (Email_Donante == null || Email_Donante.isEmpty()) {
            throw new IllegalArgumentException("El email del donante no puede ser nulo o vacío.");
        }
        this.Email_Donante = Email_Donante;
    }

    public String getTelefono_Donante() {
        return Telefono_Donante;
    }

    public void setTelefono_Donante(String Telefono_Donante) {
        if (Telefono_Donante == null || Telefono_Donante.isEmpty()) {
            throw new IllegalArgumentException("El teléfono del donante no puede ser nulo o vacío.");
        }
        this.Telefono_Donante = Telefono_Donante;
    }
}
