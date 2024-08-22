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
        Servicios_Donacion servicio = ControladoraServicios.obtener_Servicios_Donacion();
        LinkedList<Donacion> lista = servicio.getDonaciones();
        Donacion actividad = servicio.read_DonacionPorID("DN001");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre_Donante());
        }

        System.out.println(actividad.getNombre_Donante());


    }
}