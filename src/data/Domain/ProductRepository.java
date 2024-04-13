package data.Domain;

import java.util.ArrayList;
public interface ProductRepository {
    ProductData store(ProductData product);
    ArrayList<ProductData> getAll();
    ProductData getById(int id);
    ProductData update(int id);
    void remove(int id);
}