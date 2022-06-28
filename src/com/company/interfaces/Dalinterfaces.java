package com.company.interfaces;

import java.util.List;

public interface Dalinterfaces<T> {

    void insert(T entity);

    List<T> getAll();

    T delete(T entity);

    void update(T entity);

    List<T> getById(int id);
}
