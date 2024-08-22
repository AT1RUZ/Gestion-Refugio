package services;

import dto.Actividad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class Servicios_Actividad {

    public Servicios_Actividad() {}

    public void create_Actividad(Actividad actividad) throws SQLException {
        String sql = "INSERT INTO public.\"Actividad\" (" +
                "\"ID_Actividad\", \"Descripci?n_Actividad\", \"Precio\", \"Precio_Transporte\", " +
                "\"ID_Animal\", \"ID_Contratado_Veterinario\", \"ID_Contratado_Proveedor_Alimentos\", " +
                "\"ID_Contratado_Proveedor_Servicios_Complementarios\", \"ID_Transporte\", \"Dia\", \"Hora\") " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, actividad.getIdActividad());
            stmt.setString(2, actividad.getDescripcionActividad());
            stmt.setDouble(3, actividad.getPrecio());
            stmt.setDouble(4, actividad.getPrecioTransporte());
            stmt.setString(5, actividad.getIdAnimal());
            stmt.setString(6, actividad.getIdContratadoVeterinario());
            stmt.setString(7, actividad.getIdContratadoProveedorAlimentos());
            stmt.setString(8, actividad.getIdContratadoProveedorServiciosComplementarios());
            stmt.setString(9, actividad.getIdTransporte());
            stmt.setDate(10, actividad.getDia());
            stmt.setTime(11, actividad.getHora());
            stmt.executeUpdate();
        }
    }

    public Actividad read_Actividad(String idActividad) throws SQLException {
        String sql = "SELECT * FROM public.\"Actividad\" WHERE \"ID_Actividad\" = ?";
        Connection connection = ControladoraServicios.getConexion();
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, idActividad);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Actividad(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getDate(10),
                        rs.getTime(11)
                );
            }
            return null;
        }

    }

    public void update_Actividad(Actividad actividad) throws SQLException {
        String sql = "UPDATE public.\"Actividad\" SET " +
                "\"Descripci?n_Actividad\" = ?, \"Precio\" = ?, \"Precio_Transporte\" = ?, " +
                "\"ID_Animal\" = ?, \"ID_Contratado_Veterinario\" = ?, \"ID_Contratado_Proveedor_Alimentos\" = ?, " +
                "\"ID_Contratado_Proveedor_Servicios_Complementarios\" = ?, \"ID_Transporte\" = ?, " +
                "\"Dia\" = ?, \"Hora\" = ? WHERE \"ID_Actividad\" = ?";
        Connection connection = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, actividad.getDescripcionActividad());
            stmt.setDouble(2, actividad.getPrecio());
            stmt.setDouble(3, actividad.getPrecioTransporte());
            stmt.setString(4, actividad.getIdAnimal());
            stmt.setString(5, actividad.getIdContratadoVeterinario());
            stmt.setString(6, actividad.getIdContratadoProveedorAlimentos());
            stmt.setString(7, actividad.getIdContratadoProveedorServiciosComplementarios());
            stmt.setString(8, actividad.getIdTransporte());
            stmt.setDate(9, actividad.getDia());
            stmt.setTime(10, actividad.getHora());
            stmt.setString(11, actividad.getIdActividad());
            stmt.executeUpdate();
        }
    }

    public void delete_Actividad(String idActividad) throws SQLException {
        String sql = "DELETE FROM public.\"Actividad\" WHERE \"ID_Actividad\" = ?";
        Connection connection = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, idActividad);
            stmt.executeUpdate();
        }
    }

    public LinkedList<Actividad> get_Actividades() throws SQLException {
        LinkedList<Actividad> actividades = new LinkedList<>();
        String sql = "SELECT * FROM public.\"Actividad\"";
        Connection connection = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Actividad actividad = new Actividad(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getDate(10),
                        rs.getTime(11)
                );
                actividades.add(actividad);
            }
        }
        return actividades;
    }



}
