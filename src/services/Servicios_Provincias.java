package services;

import dto.Provincia;

import java.sql.*;
import java.util.LinkedList;

public class Servicios_Provincias {

    public Servicios_Provincias() {
    }

    public Provincia read_Provincia(String idProvincia) throws SQLException {
        String sql = "SELECT * FROM \"Provincias\" WHERE \"ID_Provincia\" = ?";
        Connection conexion = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, idProvincia);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Provincia(
                            rs.getString("ID_Provincia"),
                            rs.getString("Nombre_Provincia")
                    );
                }
            }
        }
        return null;
    }

    public LinkedList<Provincia> getProvincias() throws SQLException {
        LinkedList<Provincia> provincias = new LinkedList<>();
        String sql = "SELECT * FROM \"Provincias\"";
        Connection conexion = ControladoraServicios.getConexion();

        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Provincia provincia = new Provincia(
                        rs.getString("ID_Provincia"),
                        rs.getString("Nombre_Provincia")
                );
                provincias.add(provincia);
            }
        }
        return provincias;
    }

}
