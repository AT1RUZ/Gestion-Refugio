package utils;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static java.sql.Connection connection;

    public Conexion(String serveraddres, String database, String user, String pass) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://" + serveraddres + ":5432/" + database;
        connection = DriverManager.getConnection(url, user, pass);
    }

    public java.sql.Connection getConnection() {
        return connection;
    }
}
