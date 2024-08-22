package services;

import dto.Proveedor_Servicios_Complementarios;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class Servicios_Proveedor_Servicios_Complementarios {
   public Servicios_Proveedor_Servicios_Complementarios() {
    }

    public LinkedList<Proveedor_Servicios_Complementarios> obtener_proveedores_servicios_complementarios() throws SQLException {
        LinkedList<Proveedor_Servicios_Complementarios> lista = new LinkedList<>();
        Connection conexion = ControladoraServicios.getConexion();
        String sql = "select * from public.\"Contratado\" c join public.\"Proveedor_Servicios_Complementarios\" p\n" +
                "on c.\"ID_Contratado\" = p.\"ID_Contratado\" ";
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.execute();
        ResultSet result = statement.getResultSet();

        while (result.next()){
            Proveedor_Servicios_Complementarios objeto = new Proveedor_Servicios_Complementarios(
                    result.getString(1),
                    result.getString(2),
                    result.getString(3),
                    result.getString(5),
                    result.getString(6),
                    result.getString(7),
                    result.getString(8),
                    result.getString(9)
            );

            lista.add(objeto);
        }

        result.close();
        statement.close();
        conexion.close();

        return lista;
    }


}
