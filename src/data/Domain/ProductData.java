package data.Domain;

import java.util.ArrayList;

public abstract class ProductData {
    int id;
    String name;
    String description;
    double value;
    ArrayList<String> dimensions;

    public ProductData(int id, String name, String description, double value, ArrayList<String> dimensions) {
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
    public abstract ArrayList<String> getDimensions();

    public void setId(int id) {
    }

    public void setName(String name) {

    }

    public void setDescription(String description) {
    }

    public void setValue(double value) {
    }

    public void setDimensions(ArrayList<String> dimensions) {
    }
}
