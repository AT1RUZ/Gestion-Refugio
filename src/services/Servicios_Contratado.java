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

    public boolean create_Contratado(Contratado contratado) throws SQLException {
        String sql = "INSERT INTO \"Contratado\" (\"ID_Contratado\", \"C?digo_Contrato\", \"ID_Provincia\") VALUES (?, ?, ?)";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, contratado.getIdContratado());
            stmt.setString(2, contratado.getCodigoContrato());
            stmt.setString(3, contratado.getIdProvincia());

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        }
    }

    public Contratado read_Contratado(String idContratado) throws SQLException {
        String sql = "SELECT * FROM \"Contratado\" WHERE \"ID_Contratado\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, idContratado);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Contratado(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3)
                    );
                }
            }
        }
        return null;
    }

    public boolean update_Contratado(Contratado contratado) throws SQLException {
        String sql = "UPDATE \"Contratado\" SET \"C?digo_Contrato\" = ?, \"ID_Provincia\" = ? WHERE \"ID_Contratado\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, contratado.getCodigoContrato());
            stmt.setString(2, contratado.getIdProvincia());
            stmt.setString(3, contratado.getIdContratado());

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    public boolean delete_Contratado(String idContratado) throws SQLException {
        String sql = "DELETE FROM \"Contratado\" WHERE \"ID_Contratado\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, idContratado);

            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;
        }
    }

}
