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
        Servicios_Tipo_Alimento servicio = ControladoraServicios.obtener_Servicios_Tipo_Alimento();
        LinkedList<Tipo_Alimento> lista = servicio.getTiposAlimento();
        Tipo_Alimento actividad = servicio.read_TipoAlimentoPorID("AL001");
        Tipo_Alimento alimento = new Tipo_Alimento("AL006", "Comida Procesada");

//        servicio.create_TipoAlimento(alimento);
        servicio.delete_TipoAlimento(alimento.getIdAlimento());

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombreAlimento());
        }

        System.out.println(actividad.getNombreAlimento());


    }
}