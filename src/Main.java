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
        Servicios_Provincias servicio = ControladoraServicios.obtener_Servicios_Provincias();
        LinkedList<Provincia> lista = servicio.getProvincias();
        Provincia actividad = servicio.read_Provincia("P6");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombreProvincia());
        }

        System.out.println(actividad.getNombreProvincia());


    }
}