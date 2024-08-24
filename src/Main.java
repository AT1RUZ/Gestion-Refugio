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
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        SwingUtilities.invokeLater(() -> {
            PantallaPrincipal login = new PantallaPrincipal();
            login.setVisible(true);
        });
    }
}