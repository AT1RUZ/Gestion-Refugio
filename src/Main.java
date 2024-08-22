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
        Servicios_Proveedor_Alimentos servicio = ControladoraServicios.obtener_Servicios_Proveedor_Alimentos();
        LinkedList<Proveedor_Alimentos> lista = servicio.getProveedores();
        Proveedor_Alimentos actividad = servicio.read_ProveedorPorID("CON006");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombreProveedor());
        }

        System.out.println(actividad.getIdContratado());


    }
}