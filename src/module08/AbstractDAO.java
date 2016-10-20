package module08;

import java.util.List;

public interface AbstractDAO <T> {
    T save(T obj);
    void delete(T obj);
    void deleteAll(List <T> obj);
    void saveAll(List <T> obj);
    List <T> getList();
}
