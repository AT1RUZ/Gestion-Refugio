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
        Servicios_Proveedor_Servicios_Complementarios servicio = ControladoraServicios.obtener_Servicios_Proveedores_Servicios_Complementarios();
        LinkedList<Proveedor_Servicios_Complementarios> lista = servicio.get_proveedores_servicios_complementarios();
        Proveedor_Servicios_Complementarios actividad = servicio.read_Proveedor("CON007");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre_Proveedor());
        }

        System.out.println(actividad.getNombre_Proveedor());


    }
}