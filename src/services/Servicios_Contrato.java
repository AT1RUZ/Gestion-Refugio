package services;

import dto.Contrato;

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

    public void create_Contrato(Contrato contrato) {
        Connection conexion = ControladoraServicios.getConexion();
        String sql = "INSERT INTO public.\"Contratos\" (\"Código_Contrato\", \"Nombre\", \"Tipo_Servicio\", \"Direccion\", \"Telefono\", \"Email\", \"Nombre_Responsable\", \"Fecha_Inicio\", \"Fecha_Terminacion\", \"Fecha_Conciliacion \", \"Descripción\") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement pstmt = conexion.prepareStatement(sql);

            pstmt.setString(1, contrato.getCodigoContrato());
            pstmt.setString(2, contrato.getNombre());
            pstmt.setString(3, contrato.getTipoServicio());
            pstmt.setString(4, contrato.getDireccion());
            pstmt.setString(5, contrato.getTelefono());
            pstmt.setString(6, contrato.getEmail());
            pstmt.setString(7, contrato.getNombreResponsable());
            pstmt.setDate(8, contrato.getFechaInicio());
            pstmt.setDate(9, contrato.getFechaTerminacion());
            pstmt.setDate(10, contrato.getFechaConciliacion());
            pstmt.setString(11, contrato.getDescripcion());

            pstmt.executeUpdate();
            pstmt.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al crear el contrato: " + e.getMessage());
        }
    }


    public Contrato read_Contrato(String codigoContrato) throws SQLException {
        String sql = "SELECT * FROM \"Contratos\" WHERE \"Código_Contrato\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, codigoContrato);

            try (ResultSet result = stmt.executeQuery()) {
                if (result.next()) {
                    return new Contrato(
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
                }
            }
        }
        return null;
    }

    public boolean update_Contrato(Contrato contrato) throws SQLException {
        String sql = "UPDATE \"Contratos\" SET \"Nombre\" = ?, \"Tipo_Servicio\" = ?, \"Direccion\" = ?, \"Telefono\" = ?, \"Email\" = ?, \"Nombre_Responsable\" = ?, \"Fecha_Inicio\" = ?, \"Fecha_Terminacion\" = ?, \"Fecha_Conciliacion \" = ?, \"Descripción\" = ? WHERE \"Código_Contrato\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, contrato.getNombre());
            stmt.setString(2, contrato.getTipoServicio());
            stmt.setString(3, contrato.getDireccion());
            stmt.setString(4, contrato.getTelefono());
            stmt.setString(5, contrato.getEmail());
            stmt.setString(6, contrato.getNombreResponsable());
            stmt.setDate(7, contrato.getFechaInicio());
            stmt.setDate(8, contrato.getFechaTerminacion());
            stmt.setDate(9, contrato.getFechaConciliacion());
            stmt.setString(10, contrato.getDescripcion());
            stmt.setString(11, contrato.getCodigoContrato());

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    public boolean delete_Contrato(String codigoContrato) throws SQLException {
        String sql = "DELETE FROM \"Contratos\" WHERE \"Código_Contrato\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, codigoContrato);

            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;
        }
    }



}
