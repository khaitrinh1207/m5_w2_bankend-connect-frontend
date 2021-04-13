package backend.crudangular.service;

import java.util.List;

public interface IGeneric<T> {
    List<T> getAll();
    T save(T t);
    void delete(Long id);
    T findById(Long id);
}
