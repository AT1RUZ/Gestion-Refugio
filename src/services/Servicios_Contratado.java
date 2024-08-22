package services;

import dto.Contratado;
import dto.Contrato;

import java.sql.*;
import java.util.LinkedList;

public class Servicios_Contratado {

    public Servicios_Contratado() {}

    public LinkedList<Contratado> getContratados() throws SQLException {
        LinkedList<Contratado> lista = new LinkedList<>();
        Connection conexion = ControladoraServicios.getConexion();
        String sql = "select * from public.\"Contratado\"";
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.execute();
        ResultSet result = statement.getResultSet();

        while (result.next()){
            Contratado objeto = new Contratado(
                    result.getString(1),
                    result.getString(2),
                    result.getString(3)
            );

            lista.add(objeto);
        }

        result.close();
        statement.close();
        conexion.close();
        return lista;
    }

    public void create_Contratado(Contratado contratado){
        Connection conexion = ControladoraServicios.getConexion();
        String funcion = "{?= call public.create_contratado(?, ?, ?)}";

        try{
            CallableStatement stmt = conexion.prepareCall(funcion);

            stmt.setString(1, contratado.getIdContratado());
            stmt.setString(2, contratado.getCodigoContrato());
            stmt.setString(3, contratado.getIdProvincia());

            stmt.execute();
            stmt.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al crear el contrato: " + e.getMessage());
        }


    }
}
