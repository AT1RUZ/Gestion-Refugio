package services;
import dto.Animal;

import java.sql.*;
import java.util.LinkedList;

public class Servicios_Animal {

    public Servicios_Animal() {}

    public void create_Animal(Animal animal) throws SQLException {
        String query = "INSERT INTO \"Animal\" (\"ID_Animal\", \"Nombre\", \"Especie\", \"Raza\", \"Edad\", \"Peso\", \"Dias_Refugio\", \"Precio_Mantenimiento\", \"Precio_Adopci?n\") " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, animal.getIdAnimal());
            stmt.setString(2, animal.getNombre());
            stmt.setString(3, animal.getEspecie());
            stmt.setString(4, animal.getRaza());
            stmt.setInt(5, animal.getEdad());
            stmt.setDouble(6, animal.getPeso());
            stmt.setInt(7, animal.getDiasRefugio());
            stmt.setDouble(8, animal.getPrecioMantenimiento());
            stmt.setDouble(9, animal.getPrecioAdopcion());
            stmt.executeUpdate();
        }
    }

    public void update_Animal(Animal animal) throws SQLException {
        String query = "UPDATE \"Animal\" SET \"Nombre\" = ?, \"Especie\" = ?, \"Raza\" = ?, \"Edad\" = ?, \"Peso\" = ?, \"Dias_Refugio\" = ?, \"Precio_Mantenimiento\" = ?, \"Precio_Adopci?n\" = ? " +
                "WHERE \"ID_Animal\" = ?";
        Connection connection = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, animal.getNombre());
            stmt.setString(2, animal.getEspecie());
            stmt.setString(3, animal.getRaza());
            stmt.setInt(4, animal.getEdad());
            stmt.setDouble(5, animal.getPeso());
            stmt.setInt(6, animal.getDiasRefugio());
            stmt.setDouble(7, animal.getPrecioMantenimiento());
            stmt.setDouble(8, animal.getPrecioAdopcion());
            stmt.setString(9, animal.getIdAnimal());
            stmt.executeUpdate();
        }
    }

    public Animal read_AnimalPorId(String idAnimal) throws SQLException {
        String query = "SELECT * FROM \"Animal\" WHERE \"ID_Animal\" = ?";
        Connection connection = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, idAnimal);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Animal(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getInt(5),
                            rs.getDouble(6),
                            rs.getInt(7),
                            rs.getDouble(8),
                            rs.getDouble(9)
                    );
                }
            }
        }
        return null; // Si no se encuentra el animal
    }

    public void delete_Animal(String idAnimal) throws SQLException {
        String query = "DELETE FROM \"Animal\" WHERE \"ID_Animal\" = ?";
        Connection connection = ControladoraServicios.getConexion();

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, idAnimal);
            stmt.executeUpdate();
        }
    }

    public LinkedList<Animal> get_Animales() throws SQLException {
        LinkedList<Animal> animales = new LinkedList<>();
        String query = "SELECT * FROM \"Animal\"";
        Connection connection = ControladoraServicios.getConexion();

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Animal animal = new Animal(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getDouble(6),
                        rs.getInt(7),
                        rs.getDouble(8),
                        rs.getDouble(9)
                );
                animales.add(animal);
            }
        }
        return animales;
    }


}
