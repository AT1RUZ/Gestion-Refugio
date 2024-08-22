import services.ControladoraServicios;
import utils.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conexion = ControladoraServicios.getConexion();
        String sql = "SELECT * FROM public.\"Veterinarios\"";
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.execute();
        ResultSet result = statement.getResultSet();

        System.out.println(result);

        result.close();
        statement.close();
        conexion.close();
    }
}