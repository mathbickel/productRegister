package data.Infra;

import data.Domain.ProductData;
import data.Domain.ProductRepository;
import database.Driver;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class ProductRepositoryMySql implements ProductRepository {

    @Override
    public ProductData store(ProductData product) {
        String query = "INSERT INTO product(id, name, description, value, dimensions) VALUES (?, ?, ?, ?, ?)";
        new Driver().store(query, product);
        return product;
    }

    @Override
    public ArrayList<ProductData> getAll() {
        String query = "SELECT * FROM product";
        return new Driver().getAll(query);
    }

    @Override
    public ProductData getById(int id) {
        Array dimensions = null;
        return null;
    }

    @Override
    public ProductData update(int id) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
