package data.Domain;

import java.lang.reflect.Array;

public class Product extends ProductData {
    public Product(int id, String name, String description, double value, Array dimensions) {
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
    public Array getDimensions() {
        return this.dimensions;
    }
}
