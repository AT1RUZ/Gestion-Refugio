package services;

import dto.Proveedor_Servicios_Complementarios;

import java.sql.Connection;
import java.util.LinkedList;

public class Servicios_Proveedor_Servicios_Complementarios {
    private int columnas;
    public Servicios_Proveedor_Servicios_Complementarios() {
        this.columnas = 6;
    }

    public LinkedList<Proveedor_Servicios_Complementarios> obtener_proveedores_servicios_complementarios(){
        LinkedList<Proveedor_Servicios_Complementarios> lista = new LinkedList<>();
        Connection conexion = ControladoraServicios.getConexion();

        return lista;
    }
}
