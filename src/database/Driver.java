package database;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.*;
import java.util.ArrayList;

public class Driver {
    public static void driver(String[] args) throws SQLException {
    }

    public ResultSet store(String query, int id, String name, String description, double value, ArrayList<Integer> dimensions) {
        return this.insertQuery(query, id, name, description, value,dimensions);
    }

    public ResultSet getAll(String query) {
        return this.getQuery(query);
    }

    private ResultSet insertQuery(String query, int id, String name, String description, double value, ArrayList<Integer> dimensions) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root", "");
             PreparedStatement statement = connection.prepareStatement(query))
        {
            ObjectMapper objectMapper = new ObjectMapper();
            String dimensionsJson = objectMapper.writeValueAsString(dimensions);

            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, description);
            statement.setDouble(4, value);
            statement.setString(5, dimensionsJson);

            int rowsCount = statement.executeUpdate();
            if (rowsCount > 0) {
                System.out.println("Product inserted!");
            }
            return statement.getResultSet();
        } catch (SQLException | JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private ResultSet getQuery(String query) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root", "");
             Statement statement = connection.createStatement()) {
            return statement.executeQuery(query);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return null;
    }
}
