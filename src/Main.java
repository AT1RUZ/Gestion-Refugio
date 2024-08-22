import dto.*;
import services.*;
import utils.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Servicios_Animal servicio = ControladoraServicios.obtener_Servicios_Animal();
        LinkedList<Animal> lista = servicio.get_Animales();
        Animal actividad = servicio.read_AnimalPorId("AN030");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre());
        }

        System.out.println(actividad.getNombre());


    }
}