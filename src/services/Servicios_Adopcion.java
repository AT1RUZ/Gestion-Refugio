package services;

import dto.Adopcion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class Servicios_Adopcion {
    public Servicios_Adopcion() {
    }

    public void create_Adopcion(Adopcion adopcion) throws SQLException {
        String sql = "INSERT INTO public.\"Adopciones\" (" +
                "\"ID_Adopcion\", \"ID_Animal\", \"Fecha\", \"Costo_Adopcion\", " +
                "\"Nombre_Adoptante\", \"Email_Adoptante\", \"Telefono_Adoptante\") " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection connection = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, adopcion.getIdAdopcion());
            stmt.setString(2, adopcion.getIdAnimal());
            stmt.setDate(3, adopcion.getFecha());
            stmt.setDouble(4, adopcion.getCostoAdopcion());
            stmt.setString(5, adopcion.getNombreAdoptante());
            stmt.setString(6, adopcion.getEmailAdoptante());
            stmt.setString(7, adopcion.getTelefonoAdoptante());
            stmt.executeUpdate();
        }
    }

    public Adopcion read_Adopcion(String idAdopcion) throws SQLException {
        String sql = "SELECT * FROM public.\"Adopciones\" WHERE \"ID_Adopcion\" = ?";
        Connection connection = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, idAdopcion);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Adopcion(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)
                );
            }
            return null;
        }
    }

    public void update_Adopcion(Adopcion adopcion) throws SQLException {
        String sql = "UPDATE public.\"Adopciones\" SET " +
                "\"ID_Animal\" = ?, \"Fecha\" = ?, \"Costo_Adopcion\" = ?, " +
                "\"Nombre_Adoptante\" = ?, \"Email_Adoptante\" = ?, \"Telefono_Adoptante\" = ? " +
                "WHERE \"ID_Adopcion\" = ?";
        Connection connection = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, adopcion.getIdAnimal());
            stmt.setDate(2, adopcion.getFecha());
            stmt.setDouble(3, adopcion.getCostoAdopcion());
            stmt.setString(4, adopcion.getNombreAdoptante());
            stmt.setString(5, adopcion.getEmailAdoptante());
            stmt.setString(6, adopcion.getTelefonoAdoptante());
            stmt.setString(7, adopcion.getIdAdopcion());
            stmt.executeUpdate();
        }
    }

    public void detele_Adopcion(String idAdopcion) throws SQLException {
        String sql = "DELETE FROM public.\"Adopciones\" WHERE \"ID_Adopcion\" = ?";
        Connection connection = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, idAdopcion);
            stmt.executeUpdate();
        }
    }

    public LinkedList<Adopcion> get_Adopciones() throws SQLException {
        LinkedList<Adopcion> adopciones = new LinkedList<>();
        String sql = "SELECT * FROM public.\"Adopciones\"";
        Connection connection = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Adopcion adopcion = new Adopcion(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)
                );
                adopciones.add(adopcion);
            }
        }
        return adopciones;
    }

}
