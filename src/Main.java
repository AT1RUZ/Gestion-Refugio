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
        Servicios_Adopcion servicio = ControladoraServicios.obtener_Servicios_Adopcion();
        LinkedList<Adopcion> lista = servicio.get_Adopciones();
        Adopcion actividad = servicio.read_Adopcion("AD001");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombreAdoptante());
        }

//        System.out.println(actividad.getNombreAdoptante());


    }
}