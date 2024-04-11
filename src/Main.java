import controller.ProductController;
import data.Domain.Product;
import data.Domain.ProductData;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        showProducts();
//        createProd();
    }

    public static ProductData createProd() {
        ArrayList<Integer> dimensions = new ArrayList<>();
        dimensions.add(10);
        dimensions.add(15);
        dimensions.add(17);
        ProductData product = new Product(2, "Tênis Nike", "Air max 90 Classic", 350, null);
        return new ProductController().store(product);
    }

    public static ArrayList<ProductData> showProducts() {
        return new ProductController().show();
    }

    public static ProductData getById() {
        return new ProductController().getById(1);
    }
}