import dto.*;
import services.*;
import utils.Conexion;
import visuals.Login;
import visuals.Login2;
import visuals.principal.PantallaPrincipal;
import visuals.principal.Principal;

import javax.swing.*;
import java.sql.*;
import java.util.LinkedList;

public class Main {
//    public static  void main(String[] args) throws SQLException, ClassNotFoundException {
////        Servicios_Contratado listados = ControladoraServicios.obtener_Servicios_Contratado();
////
////        LinkedList<Contratado> listado = listados.getContratados();
////
////        for (int i = 0; i < listado.size(); i++) {
////            System.out.println(listado.get(i).getCodigoContrato());
////        }
//
//        SwingUtilities.invokeLater(() -> {
//            Principal login = new Principal();
//            login.setVisible(true);
//        });
//
//    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        SwingUtilities.invokeLater(() -> {
            PantallaPrincipal login = new PantallaPrincipal();
            login.setVisible(true);
        });
    }
}