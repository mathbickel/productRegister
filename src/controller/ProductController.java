package controller;

import data.Domain.ProductData;
import data.Infra.ProductServiceImp;

import java.util.ArrayList;

public class ProductController implements BaseController {

    public ProductController() {
    }

    @Override
    public ProductData store(Object data) {
        ProductData product = ((ProductData) data);
        if(product == null) return null;
        return new ProductServiceImp().store(product);
    }

    @Override
    public ArrayList<ProductData> show() {
        return new ProductServiceImp().getAll();
    }

    @Override
    public ProductData getById(int id) {
        return new ProductServiceImp().getById(id);
    }

    @Override
    public ProductData update(int id) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
