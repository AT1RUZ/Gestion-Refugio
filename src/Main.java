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
        Servicios_Tipo_Servicio servicio = ControladoraServicios.obtener_Servicios_Tipo_Servicio();
        LinkedList<Tipo_Servicio> lista = servicio.getTipoServicios();
        Tipo_Servicio actividad = servicio.read_TipoServicio("SER001");
        Tipo_Servicio alimento = new Tipo_Servicio("SER011", "Emergencias");

//        servicio.create_TipoServicio(alimento);
        servicio.delete_TipoServicio(alimento.getIdServicio());

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombreServicio());
        }

        System.out.println(actividad.getNombreServicio());


    }
}