import dto.*;
import services.*;
import utils.Conexion;

import java.sql.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Listados listados = ControladoraServicios.obtener_Listados();

        LinkedList<Plan_Ingresos_Adopciones_Donaciones> listado = listados.planIngresosAdopcionesDonaciones();

        for (int i = 0; i < listado.size(); i++) {
            System.out.println(listado.get(i));
        }

    }


    System.out.println("Hello World");
}