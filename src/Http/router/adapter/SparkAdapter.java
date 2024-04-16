package Http.router.adapter;

import Http.router.HttpClient.HttpClient;
import controller.ProductController;
import spark.Spark;

public class SparkAdapter implements HttpClient {
    public SparkAdapter() {
        Spark.port(8080);
        Spark.put("/products/:id/name", (request, response) -> {
            int productId = Integer.parseInt(request.params("id"));
            String body = request.body();
            System.out.println(body);
            new ProductController().update(productId);
            response.status(200);
            return "Product name updated successfully";
        });
    }
}
