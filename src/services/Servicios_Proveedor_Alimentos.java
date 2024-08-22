package services;

import dto.Proveedor_Alimentos;

import java.sql.*;
import java.util.LinkedList;

public class Servicios_Proveedor_Alimentos {

    public Servicios_Proveedor_Alimentos() {}

    public boolean create_ProveedorAlimentos(Proveedor_Alimentos proveedor) throws SQLException {
        String sql = "INSERT INTO \"Proveedores_Alimentos\" (\"ID_Contratado\", \"Nombre_Proveedor\", \"Direcci?n\", \"Email\", \"ID_Alimento\") VALUES (?, ?, ?, ?, ?)";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, proveedor.getIdContratado());
            stmt.setString(2, proveedor.getNombreProveedor());
            stmt.setString(3, proveedor.getDireccion());
            stmt.setString(4, proveedor.getEmail());
            stmt.setString(5, proveedor.getIdAlimento());

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Proveedor_Alimentos read_ProveedorPorID(String idContratado) throws SQLException {
        String sql = "select * from \"Proveedores_Alimentos\" pa JOIN \"Contratado\" c \n" +
                "on pa.\"ID_Contratado\" = c.\"ID_Contratado\"\n" +
                "where pa.\"ID_Contratado\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, idContratado);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Proveedor_Alimentos(
                            rs.getString(1),
                            rs.getString(7),
                            rs.getString(8),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5)
                    );
                }
            }
        }
        return null;
    }

    public boolean actualizarProveedorAlimentos(Proveedor_Alimentos proveedor) throws SQLException {
        String sql = "UPDATE \"Proveedores_Alimentos\" SET \"Nombre_Proveedor\" = ?, \"Direcci?n\" = ?, \"Email\" = ?, \"ID_Alimento\" = ? WHERE \"ID_Contratado\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, proveedor.getNombreProveedor());
            stmt.setString(2, proveedor.getDireccion());
            stmt.setString(3, proveedor.getEmail());
            stmt.setString(4, proveedor.getIdAlimento());
            stmt.setString(5, proveedor.getIdContratado());

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    public boolean eliminarProveedorAlimentos(String idContratado) throws SQLException {
        String sql = "DELETE FROM \"Proveedores_Alimentos\" WHERE \"ID_Contratado\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, idContratado);

            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;
        }
    }

    public LinkedList<Proveedor_Alimentos> getProveedores() throws SQLException {
        LinkedList<Proveedor_Alimentos> proveedores = new LinkedList<>();
        String sql = "select * from \"Proveedores_Alimentos\" pa JOIN \"Contratado\" c \n" +
                "                on pa.\"ID_Contratado\" = c.\"ID_Contratado\"";
        Connection conexion = ControladoraServicios.getConexion();


        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Proveedor_Alimentos proveedor = new Proveedor_Alimentos(
                        rs.getString(1),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                );
                proveedores.add(proveedor);
            }
        }
        return proveedores;
    }

}
