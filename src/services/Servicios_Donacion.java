package services;

import dto.Donacion;

import java.sql.*;
import java.util.LinkedList;

public class Servicios_Donacion {
    public Servicios_Donacion() {}

    public boolean create_Donacion(Donacion donacion) throws SQLException {
        String sql = "INSERT INTO \"Donaciones\" (\"ID_Donacion\", \"Monto\", \"Fecha\", \"Nombre_Donante\", \"Email_Donante\", \"Telefono_Donante\", \"ID_Animal\") VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, donacion.getID_Donacion());
            stmt.setDouble(2, donacion.getMonto());
            stmt.setDate(3, donacion.getFecha());
            stmt.setString(4, donacion.getNombre_Donante());
            stmt.setString(5, donacion.getEmail_Donante());
            stmt.setString(6, donacion.getTelefono_Donante());
            stmt.setString(7, donacion.getID_Animal());

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        }
    }

    public Donacion read_DonacionPorID(String idDonacion) throws SQLException {
        String sql = "SELECT * FROM \"Donaciones\" WHERE \"ID_Donacion\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, idDonacion);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Donacion(
                            rs.getString(1),
                            rs.getDouble(2),
                            rs.getDate(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7)
                    );
                }
            }
        }
        return null;
    }

    public boolean update_Donacion(Donacion donacion) throws SQLException {
        String sql = "UPDATE \"Donaciones\" SET \"Monto\" = ?, \"Fecha\" = ?, \"Nombre_Donante\" = ?, \"Email_Donante\" = ?, \"Telefono_Donante\" = ?, \"ID_Animal\" = ? WHERE \"ID_Donacion\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setDouble(1, donacion.getMonto());
            stmt.setDate(2, donacion.getFecha());
            stmt.setString(3, donacion.getNombre_Donante());
            stmt.setString(4, donacion.getEmail_Donante());
            stmt.setString(5, donacion.getTelefono_Donante());
            stmt.setString(6, donacion.getID_Animal());
            stmt.setString(7, donacion.getID_Donacion());

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    public boolean delete_Donacion(String idDonacion) throws SQLException {
        String sql = "DELETE FROM \"Donaciones\" WHERE \"ID_Donacion\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, idDonacion);

            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;
        }
    }

    public LinkedList<Donacion> getDonaciones() throws SQLException {
        LinkedList<Donacion> donaciones = new LinkedList<>();
        String sql = "SELECT * FROM \"Donaciones\"";
        Connection conexion = ControladoraServicios.getConexion();

        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Donacion donacion = new Donacion(
                        rs.getString(1),
                        rs.getDouble(2),
                        rs.getDate(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)
                );
                donaciones.add(donacion);
            }
        }
        return donaciones;
    }


}
