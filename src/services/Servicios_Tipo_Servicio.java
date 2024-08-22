package services;

import dto.Tipo_Servicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class Servicios_Tipo_Servicio {

    public Servicios_Tipo_Servicio() {
    }

    public void create_TipoServicio(Tipo_Servicio tipoServicio) throws SQLException {
        String sql = "INSERT INTO public.\"Tipo_de_servicio\" (\"ID_Servicio\", \"Nombre_Servicio\") VALUES (?, ?)";

       try (Connection conn = ControladoraServicios.getConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, tipoServicio.getIdServicio());
            pstmt.setString(2, tipoServicio.getNombreServicio());
            pstmt.executeUpdate();
       }
    }

    public Tipo_Servicio read_TipoServicio(String idServicio) throws SQLException {
        String sql = "SELECT * FROM public.\"Tipo_de_servicio\" WHERE \"ID_Servicio\" = ?";
        Tipo_Servicio tipoServicio = null;

        try (Connection conn = ControladoraServicios.getConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, idServicio);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    tipoServicio = new Tipo_Servicio(
                            rs.getString("ID_Servicio"),
                            rs.getString("Nombre_Servicio")
                    );
                }
            }
        }

        return tipoServicio;
    }

    public void update_TipoServicio(Tipo_Servicio tipoServicio) throws SQLException {
        String sql = "UPDATE public.\"Tipo_de_servicio\" SET \"Nombre_Servicio\" = ? WHERE \"ID_Servicio\" = ?";

        try (Connection conn = ControladoraServicios.getConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, tipoServicio.getNombreServicio());
            pstmt.setString(2, tipoServicio.getIdServicio());
            pstmt.executeUpdate();
        }
    }

    public void delete_TipoServicio(String idServicio) throws SQLException {
        String sql = "DELETE FROM public.\"Tipo_de_servicio\" WHERE \"ID_Servicio\" = ?";

        try (Connection conn = ControladoraServicios.getConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, idServicio);
            pstmt.executeUpdate();
        }
    }

    public LinkedList<Tipo_Servicio> getTipoServicios() throws SQLException {
        String sql = "SELECT * FROM public.\"Tipo_de_servicio\"";
        LinkedList<Tipo_Servicio> tipoServicios = new LinkedList<>();

        try (Connection conn = ControladoraServicios.getConexion(); PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Tipo_Servicio tipoServicio = new Tipo_Servicio(
                        rs.getString("ID_Servicio"),
                        rs.getString("Nombre_Servicio")
                );
                tipoServicios.add(tipoServicio);
            }
        }

        return tipoServicios;
    }

}
