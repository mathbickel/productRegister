package database;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import data.Domain.Product;
import data.Domain.ProductData;
import java.sql.*;
import java.util.ArrayList;

public class Driver {
    public static void driver(String[] args) {
    }

    public ResultSet store(String query, ProductData product) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root", "");
             PreparedStatement statement = connection.prepareStatement(query))
        {
            int rowsCount = buildStatement(statement, product).executeUpdate();;
            if (rowsCount > 0) {
                System.out.println("Product inserted!");
            }
            return statement.getResultSet();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public ArrayList<ProductData> getAll(String query) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root", "");
             Statement statement = connection.createStatement())
        {
            ArrayList<ProductData> prods = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                double value = resultSet.getDouble("value");
                String dimensions = resultSet.getString("dimensions");
                ProductData products = new Product(id, name, description, value, this.buildDimensionsArr(dimensions));
                prods.add(products);
            }
            System.out.println(prods);
            return prods;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            throw new RuntimeException();
        }
    }

    private PreparedStatement buildStatement(PreparedStatement statement, ProductData product) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String dimensionsJson = objectMapper.writeValueAsString(product.getDimensions());

            statement.setInt(1, product.getId());
            statement.setString(2, product.getName());
            statement.setString(3, product.getDescription());
            statement.setDouble(4, product.getValue());
            statement.setString(5, dimensionsJson);

            return statement;
        } catch (SQLException | JsonProcessingException exception) {
            exception.printStackTrace();
            throw new RuntimeException();
        }
    }

    private ArrayList<String> buildDimensionsArr(String dimensions) {
        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add(dimensions);
        return stringArray;
    }
}
