package controller;
import java.util.ArrayList;

public interface BaseController<T> {
    T store(T data);
    ArrayList<T> show();
    T getById(int id);
    ArrayList<T> update(int id);
    void remove(int id);

}
