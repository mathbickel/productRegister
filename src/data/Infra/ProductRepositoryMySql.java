package data.Infra;

import data.Domain.Product;
import data.Domain.ProductData;
import data.Domain.ProductRepository;
import database.Driver;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ProductRepositoryMySql implements ProductRepository {

    @Override
    public ProductData store(ProductData product) {
        String query = "INSERT INTO product(id, name, description, value, dimensions) VALUES (?, ?, ?, ?, ?)";
        new Driver().store(query, product.getId(), product.getName(), product.getDescription(), product.getValue(), product.getDimensions());
        return product;
    }

    @Override
    public ArrayList<ProductData> getAll() {
        try {
            ArrayList<ProductData> prods = new ArrayList<>();
            String query = "SELECT * FROM product";
            ResultSet resultSet = new Driver().getAll(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                double value = resultSet.getDouble("value");
                String dimensionsString = resultSet.getString("dimensions");
                ArrayList<Integer> dimensions = this.parseDimensions(dimensionsString);
                ProductData products = new Product(id, name, description, value, dimensions);
                prods.add(products);
            }
            System.out.println(prods);
            return prods;
        } catch (SQLException sql) {
            sql.printStackTrace();
            return null;
        }

    }

    @Override
    public ProductData getById(int id) {
        ArrayList<Integer> dimensions = new ArrayList<>();
        dimensions.add(10);
        dimensions.add(15);
        dimensions.add(17);
        ProductData prod = new Product(1, "Tênis", "Nike Air max", 10, dimensions);
        if(prod.getId() == id) {
            return prod;
        }
        return null;
    }

    @Override
    public ProductData update(int id) {
        return null;
    }

    @Override
    public void remove(int id) {

    }

    private ArrayList<Integer> parseDimensions(String dimensionsString) {
        ArrayList<Integer> dimensions = new ArrayList<>();
        String[] dimensionStrings = dimensionsString.split(",");
        for (String dimension : dimensionStrings) {
            dimensions.add(Integer.parseInt(dimension.trim()));
        }
        return dimensions;
    }

}
