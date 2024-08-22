import dto.Actividad;
import dto.Contratado;
import dto.Contrato;
import dto.Proveedor_Servicios_Complementarios;
import services.ControladoraServicios;
import services.Servicios_Actividad;
import services.Servicios_Contrato;
import services.Servicios_Proveedor_Servicios_Complementarios;
import utils.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Servicios_Actividad servicio = ControladoraServicios.obtener_servicios_Actividad();
        LinkedList<Actividad> lista = servicio.get_Actividades();
        Actividad actividad = servicio.read_Actividad("ACT001");

//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i).getDescripcionActividad());
//        }

        System.out.println(actividad.getDescripcionActividad());


    }
}