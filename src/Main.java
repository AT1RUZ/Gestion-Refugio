import dto.*;
import services.*;
import utils.Conexion;

import java.sql.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Servicios_Veterinario servicioVet = ControladoraServicios.obtener_Servicios_Veterinario();
        LinkedList<Veterinario> lista = servicioVet.getAllVeterinarios();
        Veterinario actividad = servicioVet.read_Veterinario("CON001");
        Veterinario alimento = new Veterinario(
                "CON011",
                "CTR010",
                "P4",
                "Diego Torres Zurita",
                "asd",
                "asd",
                "asd",
                "asd",
                "asd",
                "asd@asd.com",
                "asd",
                "asd"
        );

        Contratado contratado = new Contratado(
                alimento.getIdContratado(),
                alimento.getCodigoContrato(),
                alimento.getIdProvincia()
        );

        Contrato contrato = new Contrato(
                "CTR010",
                "Contrato Veterinario",
                "Veterinario",
                "asd",
                "asd",
                "asd@asd.com",
                "asd",
                new Date(2000, 06, 24),
                new Date(2000, 06, 24),
                new Date(2000, 06, 24),
                "asd"
        );
        //////
        Servicios_Contrato servicios_contrato = ControladoraServicios.obtener_Servicios_Contrato();
//        servicios_contrato.create_Contrato(contrato);

        //////

        Servicios_Contratado servicios_contratado = ControladoraServicios.obtener_Servicios_Contratado();
        servicios_contratado.create_Contratado(contratado);

        servicioVet.create_Veterinario(alimento);
//        servicio.delete_Transporte(alimento.getIdTransporte());



        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombreVeterinario());
        }

        System.out.println(actividad.getNombreVeterinario());


    }
}