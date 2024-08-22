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

    public LinkedList<Proveedor_Servicios_Complementarios> get_proveedores_servicios_complementarios() throws SQLException {
        LinkedList<Proveedor_Servicios_Complementarios> lista = new LinkedList<>();
        Connection conexion = ControladoraServicios.getConexion();
        String sql = "select * from public.\"Contratado\" c join public.\"Proveedor_Servicios_Complementarios\" p on c.\"ID_Contratado\" = p.\"ID_Contratado\" ";
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

    public boolean create_ProveedorServiciosComplementarios(Proveedor_Servicios_Complementarios proveedor) throws SQLException {
        String sql = "INSERT INTO \"Proveedor_Servicios_Complementarios\" (\"ID_Contratado\", \"Nombre_Proveedor\", \"Dirección\", \"Teléfono\", \"Email\", \"ID_Servicio\") VALUES (?, ?, ?, ?, ?, ?)";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, proveedor.getIdContratado());
            stmt.setString(2, proveedor.getNombre_Proveedor());
            stmt.setString(3, proveedor.getDireccion());
            stmt.setString(4, proveedor.getTelefono());
            stmt.setString(5, proveedor.getEmail());
            stmt.setString(6, proveedor.getID_Servicio());

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        }
    }

    public Proveedor_Servicios_Complementarios read_Proveedor(String idContratado) throws SQLException {
        String sql = "select * from public.\"Contratado\" c join public.\"Proveedor_Servicios_Complementarios\" p on c.\"ID_Contratado\" = p.\"ID_Contratado\" WHERE p.\"ID_Contratado\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, idContratado);

            try (ResultSet result = stmt.executeQuery()) {
                if (result.next()) {
                    return new Proveedor_Servicios_Complementarios(
                            result.getString(1),
                            result.getString(2),
                            result.getString(3),
                            result.getString(5),
                            result.getString(6),
                            result.getString(7),
                            result.getString(8),
                            result.getString(9)
                    );
                }
            }
        }
        return null;
    }

    public boolean update_ProveedorServiciosComplementarios(Proveedor_Servicios_Complementarios proveedor) throws SQLException {
        String sql = "UPDATE \"Proveedor_Servicios_Complementarios\" SET \"Nombre_Proveedor\" = ?, \"Dirección\" = ?, \"Teléfono\" = ?, \"Email\" = ?, \"ID_Servicio\" = ? WHERE \"ID_Contratado\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, proveedor.getNombre_Proveedor());
            stmt.setString(2, proveedor.getDireccion());
            stmt.setString(3, proveedor.getTelefono());
            stmt.setString(4, proveedor.getEmail());
            stmt.setString(5, proveedor.getID_Servicio());
            stmt.setString(6, proveedor.getIdContratado());

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    public boolean delete_ProveedorServiciosComplementarios(String idContratado) throws SQLException {
        String sql = "DELETE FROM \"Proveedor_Servicios_Complementarios\" WHERE \"ID_Contratado\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, idContratado);

            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;
        }
    }



}
