package services;

import dto.Veterinario;

import java.sql.*;
import java.util.LinkedList;

public class Servicios_Veterinario {
    public Servicios_Veterinario() {
    }

    public void create_Veterinario(Veterinario veterinario) throws SQLException {
        String sql = "INSERT INTO public.\"Veterinarios\" (\"ID_Contratado\", \"Nombre_Veterinario\", \"Clínica_Veterinario\", \"Dirección_Veterinario\", \"Especialidad_Veterinario\", \"Teléfono_Veterinario\", \"Fax_Veterinario\", \"Email_Veterinario\", \"Distancia_Ciudad_Veterinario\", \"Modalidad_Servicio_Veterinario\") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ControladoraServicios.getConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, veterinario.getIdContratado());
            pstmt.setString(2, veterinario.getNombreVeterinario());
            pstmt.setString(3, veterinario.getClinicaVeterinario());
            pstmt.setString(4, veterinario.getDireccionVeterinario());
            pstmt.setString(5, veterinario.getEspecialidadVeterinario());
            pstmt.setString(6, veterinario.getTelefonoVeterinario());
            pstmt.setString(7, veterinario.getFaxVeterinario());
            pstmt.setString(8, veterinario.getEmailVeterinario());
            pstmt.setString(9, veterinario.getDistanciaCiudadVeterinario());
            pstmt.setString(10, veterinario.getModalidadServicioVeterinario());
            pstmt.executeUpdate();
        }
    }

    public Veterinario read_Veterinario(String idContratado) throws SQLException {
        String sql = "SELECT * FROM public.\"Veterinarios\" v JOIN \"Contratado\" c\n" +
                "on v.\"ID_Contratado\" = c.\"ID_Contratado\"\n" +
                "WHERE v.\"ID_Contratado\" = ?";
        try (Connection conn = ControladoraServicios.getConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, idContratado);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Veterinario(
                            rs.getString(1),
                            rs.getString(12),
                            rs.getString(13),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7),
                            rs.getString(8),
                            rs.getString(9),
                            rs.getString(10)
                    );
                } else {
                    return null;
                }
            }
        }
    }

    public void update_Veterinario(Veterinario veterinario) throws SQLException {
        String sql = "UPDATE public.\"Veterinarios\" SET \"Nombre_Veterinario\" = ?, \"Clínica_Veterinario\" = ?, \"Dirección_Veterinario\" = ?, \"Especialidad_Veterinario\" = ?, \"Teléfono_Veterinario\" = ?, \"Fax_Veterinario\" = ?, \"Email_Veterinario\" = ?, \"Distancia_Ciudad_Veterinario\" = ?, \"Modalidad_Servicio_Veterinario\" = ? WHERE \"ID_Contratado\" = ?";
        try (Connection conn = ControladoraServicios.getConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, veterinario.getNombreVeterinario());
            pstmt.setString(2, veterinario.getClinicaVeterinario());
            pstmt.setString(3, veterinario.getDireccionVeterinario());
            pstmt.setString(4, veterinario.getEspecialidadVeterinario());
            pstmt.setString(5, veterinario.getTelefonoVeterinario());
            pstmt.setString(6, veterinario.getFaxVeterinario());
            pstmt.setString(7, veterinario.getEmailVeterinario());
            pstmt.setString(8, veterinario.getDistanciaCiudadVeterinario());
            pstmt.setString(9, veterinario.getModalidadServicioVeterinario());
            pstmt.setString(10, veterinario.getIdContratado());
            pstmt.executeUpdate();
        }
    }

    public void delete_Veterinario(String idContratado) throws SQLException {
        String sql = "DELETE FROM public.\"Veterinarios\" WHERE \"ID_Contratado\" = ?";
        try (Connection conn = ControladoraServicios.getConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, idContratado);
            pstmt.executeUpdate();
        }
    }

    public LinkedList<Veterinario> getAllVeterinarios() throws SQLException {
        String sql = " SELECT * FROM public.\"Veterinarios\" v JOIN \"Contratado\" c\n" +
                "                on v.\"ID_Contratado\" = c.\"ID_Contratado\"\n" +
                "                ";
        LinkedList<Veterinario> listaVeterinarios = new LinkedList<>();
        try (Connection conn = ControladoraServicios.getConexion(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Veterinario veterinario = new Veterinario(
                        rs.getString(1),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10)
                );
                listaVeterinarios.add(veterinario);
            }
        }
        return listaVeterinarios;
    }

}
