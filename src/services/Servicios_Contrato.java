package services;

import dto.Contrato;
import dto.Proveedor_Servicios_Complementarios;
import utils.Conexion;

import java.sql.*;
import java.util.LinkedList;

public class Servicios_Contrato {

    public Servicios_Contrato(){}

    public LinkedList<Contrato> getContratos() throws SQLException {
        LinkedList<Contrato> lista = new LinkedList<>();
        Connection conexion = ControladoraServicios.getConexion();
        String sql = "select * from public.\"Contratos\"";
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.execute();
        ResultSet result = statement.getResultSet();

        while (result.next()){
            Contrato objeto = new Contrato(
                    result.getString(1),
                    result.getString(2),
                    result.getString(3),
                    result.getString(4),
                    result.getString(5),
                    result.getString(6),
                    result.getString(7),
                    result.getDate(8),
                    result.getDate(9),
                    result.getDate(10),
                    result.getString(11)
            );

            lista.add(objeto);
        }

        result.close();
        statement.close();
        conexion.close();
        return lista;
    }

    public void create_Contrato(Contrato contrato){
        Connection conexion = ControladoraServicios.getConexion();
        String funcion = "{?= call public.create_contrato(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";

        try{
            CallableStatement stmt = conexion.prepareCall(funcion);

            stmt.setString(1, contrato.getCodigoContrato());
            stmt.setString(2, contrato.getNombre());
            stmt.setString(3, contrato.getTipoServicio());
            stmt.setString(4, contrato.getDireccion());
            stmt.setString(5, contrato.getTelefono());
            stmt.setString(6, contrato.getEmail());
            stmt.setString(7, contrato.getNombreResponsable());
            stmt.setDate(8, contrato.getFechaInicio());
            stmt.setDate(9, contrato.getFechaTerminacion());
            stmt.setDate(10, contrato.getFechaConciliacion());
            stmt.setString(11, contrato.getDescripcion());

            stmt.execute();
            stmt.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al crear el contrato: " + e.getMessage());
        }


    }

}
