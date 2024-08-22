package services;

import dto.Tipo_Alimento;

import java.sql.*;
import java.util.LinkedList;

public class Servicios_Tipo_Alimento {

    public Servicios_Tipo_Alimento() {
    }

    public boolean create_TipoAlimento(Tipo_Alimento tipoAlimento) throws SQLException {
        String sql = "INSERT INTO \"Tipos_de_Alimento\" (\"ID_Alimento\", \"Nombre_Alimento\") VALUES (?, ?)";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, tipoAlimento.getIdAlimento());
            stmt.setString(2, tipoAlimento.getNombreAlimento());

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        }
    }

    public Tipo_Alimento read_TipoAlimentoPorID(String idAlimento) throws SQLException {
        String sql = "SELECT * FROM \"Tipos_de_Alimento\" WHERE \"ID_Alimento\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, idAlimento);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Tipo_Alimento(
                            rs.getString("ID_Alimento"),
                            rs.getString("Nombre_Alimento")
                    );
                }
            }
        }
        return null;
    }

    public boolean update_TipoAlimento(Tipo_Alimento tipoAlimento) throws SQLException {
        String sql = "UPDATE \"Tipos_de_Alimento\" SET \"Nombre_Alimento\" = ? WHERE \"ID_Alimento\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, tipoAlimento.getNombreAlimento());
            stmt.setString(2, tipoAlimento.getIdAlimento());

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    public boolean delete_TipoAlimento(String idAlimento) throws SQLException {
        String sql = "DELETE FROM \"Tipos_de_Alimento\" WHERE \"ID_Alimento\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, idAlimento);

            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;
        }
    }

    public LinkedList<Tipo_Alimento> getTiposAlimento() throws SQLException {
        LinkedList<Tipo_Alimento> tiposAlimento = new LinkedList<>();
        String sql = "SELECT * FROM \"Tipos_de_Alimento\"";
        Connection conexion = ControladoraServicios.getConexion();

        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Tipo_Alimento tipoAlimento = new Tipo_Alimento(
                        rs.getString("ID_Alimento"),
                        rs.getString("Nombre_Alimento")
                );
                tiposAlimento.add(tipoAlimento);
            }
        }
        return tiposAlimento;
    }


}
