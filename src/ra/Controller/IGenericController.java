package ra.Controller;

import java.util.List;

public interface IGenericController<T, E> {
    List<T> getAll();

    void save(T t);

    T findById(E e);

    void delete(E e);
}
