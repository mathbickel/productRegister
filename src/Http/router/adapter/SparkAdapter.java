package Http.router.adapter;

import controller.ProductController;
import data.Domain.ProductData;
import spark.Request;
import spark.Response;
import spark.Spark;

public class SparkAdapter {
    public SparkAdapter() {
        Spark.port(8080);
        try {
            Spark.put("/products/:id/name", (Request request, Response response) -> {
                int productId = Integer.parseInt(request.params("id"));
                String body = request.body();
                System.out.println(body);
                ProductData prod = new ProductController().update(productId);
                response.status(200);
                response.body(String.valueOf(prod));
                return response;
            });
        }catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
            e.getCause();
            System.out.println("here");
            throw new RuntimeException();
        }
    }
}
