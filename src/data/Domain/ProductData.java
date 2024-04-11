package data.Domain;

import java.lang.reflect.Array;

public abstract class ProductData {
    int id;
    String name;
    String description;
    double value;
    Array dimensions;

    public ProductData(int id, String name, String description, double value, Array dimensions) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.value = value;
        this.dimensions = dimensions;
    }
    public abstract int getId();
    public abstract String getName();
    public abstract String getDescription();
    public abstract double getValue();
    public abstract Array getDimensions();
}
