package module08;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl <T> implements AbstractDAO <T>{
    @Override
    public T save(T obj) {
        System.out.println("Save: " + obj);
        return null;
    }

    @Override
    public void delete(T obj) {
        System.out.println("Delete: " + obj);
    }

    @Override
    public void deleteAll(List<T> obj) {
        System.out.println("Delete all");
    }

    @Override
    public void saveAll(List<T> obj) {
        System.out.println("Save all");
    }

    @Override
    public List<T> getList() {
        return new ArrayList<T>();
    }
}
