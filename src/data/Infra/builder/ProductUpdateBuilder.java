package data.Infra.builder;

import data.Domain.Product;

import java.util.ArrayList;

public class ProductUpdateBuilder {

    public ProductUpdateBuilder(Product product) {
    }

    public void name(int id, String name) {
        String query = STR."UPDATE product SET name = \{name} WHERE id = \{id}";
    }

    public void description(int id, String description) {
        String query = STR."UPDATE product SET description = \{description} WHERE id = \{id}";
    }

    public void value(int id, double value) {
        String query = STR."UPDATE product SET value = \{value} WHERE id = \{id}";
    }

    public void dimensions(int id, ArrayList<String> dimensions) {
        String query = STR."UPDATE product SET dimensions = \{dimensions} WHERE id = \{id}";
    }
}
