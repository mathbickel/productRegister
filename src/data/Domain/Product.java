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

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public void setValue(double value) {
        super.setValue(value);
    }

    @Override
    public void setDimensions(ArrayList<String> dimensions) {
        super.setDimensions(dimensions);
    }
}
