package services;

import dto.Transporte;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class Servicios_Transporte {

    public Servicios_Transporte() {
    }

    public void create_Transporte(Transporte transporte) throws SQLException {
        String sql = "INSERT INTO public.\"Transporte\" (\"ID_Transporte\", \"Vehículo\", \"Modalidad\", \"Precio\") VALUES (?, ?, ?, ?)";
        try (Connection conn = ControladoraServicios.getConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, transporte.getIdTransporte());
            pstmt.setString(2, transporte.getVehiculo());
            pstmt.setString(3, transporte.getModalidad());
            pstmt.setFloat(4, transporte.getPrecio());
            pstmt.executeUpdate();
        }
    }

    public Transporte read_Transporte(String idTransporte) throws SQLException {
        String sql = "SELECT * FROM public.\"Transporte\" WHERE \"ID_Transporte\" = ?";
        try (Connection conn = ControladoraServicios.getConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, idTransporte);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Transporte(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getFloat(4)
                    );
                } else {
                    return null;
                }
            }
        }
    }

    public void update_Transporte(Transporte transporte) throws SQLException {
        String sql = "UPDATE public.\"Transporte\" SET \"Vehículo\" = ?, \"Modalidad\" = ?, \"Precio\" = ? WHERE \"ID_Transporte\" = ?";
        try (Connection conn = ControladoraServicios.getConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, transporte.getVehiculo());
            pstmt.setString(2, transporte.getModalidad());
            pstmt.setFloat(3, transporte.getPrecio());
            pstmt.setString(4, transporte.getIdTransporte());
            pstmt.executeUpdate();
        }
    }

    public void delete_Transporte(String idTransporte) throws SQLException {
        String sql = "DELETE FROM public.\"Transporte\" WHERE \"ID_Transporte\" = ?";
        try (Connection conn = ControladoraServicios.getConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, idTransporte);
            pstmt.executeUpdate();
        }
    }

    public LinkedList<Transporte> get_Transporte() throws SQLException {
        String sql = "SELECT * FROM public.\"Transporte\"";
        LinkedList<Transporte> transportes = new LinkedList<>();

        try (Connection conn = ControladoraServicios.getConexion(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Transporte transporte = new Transporte(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getFloat(4)
                );
                transportes.add(transporte);
            }
        }

        return transportes;
    }


}
