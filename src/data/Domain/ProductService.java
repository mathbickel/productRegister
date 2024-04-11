package data.Domain;

import java.util.ArrayList;

public interface ProductService {
    ProductData store(ProductData product);
    ArrayList<ProductData> getAll();
    ProductData getById(int id);
    void remove(int id);
    ProductData update(int id);
}
