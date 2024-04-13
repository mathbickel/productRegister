package data.Domain;

import java.sql.Array;
import java.util.ArrayList;

public abstract class ProductData {
    int id;
    String name;
    String description;
    double value;
    ArrayList<Integer> dimensions;

    public ProductData(int id, String name, String description, double value, ArrayList<Integer> dimensions) {
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
    public abstract ArrayList<Integer> getDimensions();
}
