package services;

import dto.Proveedor_Servicios_Complementarios;
import utils.Conexion;

import java.sql.Connection;
import java.util.LinkedList;

public class Listados {
    public Listados(){

    }

    public LinkedList<Proveedor_Servicios_Complementarios> obtener_contratos_proveedores_servicios(){
        LinkedList<Proveedor_Servicios_Complementarios> listado = new LinkedList<>();
        Connection conexion = ControladoraServicios.getConexion();


        return listado;
    }

}
