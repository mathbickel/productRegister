package data.Infra;

import data.Domain.ProductData;
import data.Domain.ProductService;
import java.util.ArrayList;

public class ProductServiceImp implements ProductService {
    @Override
    public ProductData store(ProductData product) {
        return new ProductRepositoryMySql().store(product);
    }

    @Override
    public ArrayList<ProductData> getAll() {
        return new ProductRepositoryMySql().getAll();
    }

    @Override
    public ProductData getById(int id) {
        return new ProductRepositoryMySql().getById(id);
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public ProductData update(int id) {
        return null;
    }
}
