package data.Domain;

import java.util.ArrayList;

public class Product extends ProductData {
    public Product(int id, String name, String description, double value, ArrayList<String> dimensions) {
        super(id, name, description, value, dimensions);
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public ArrayList<String> getDimensions() {
        return this.dimensions;
    }
}
