import Http.router.adapter.SparkAdapter;
import controller.ProductController;
import data.Domain.Product;
import data.Domain.ProductData;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        showProducts();
//        createProd();
//        getById(1);
        new SparkAdapter();
    }

    public static ProductData createProd() {
        ArrayList<String> dimensions = new ArrayList<>();
        dimensions.add("10");
        dimensions.add("15");
        dimensions.add("20");
        ProductData product = new Product(3, "Tênis Nike", "Air max 90 White/Green", 325, dimensions);
        return new ProductController().store(product);
    }

    public static ArrayList<ProductData> showProducts() {
        return new ProductController().show();
    }

    public static ProductData getById(int id) {
        return new ProductController().getById(id);
    }

    public static Product update(int id) {
        return null;
    }
}