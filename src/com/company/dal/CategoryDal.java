package com.company.dal;

import com.company.core.ObjectHelper;
import com.company.interfaces.Dalinterfaces;
import com.company.types.CategoryContract;

import java.util.List;

public class CategoryDal<CategoryContract > extends ObjectHelper implements Dalinterfaces<CategoryContract> {

    @Override
    public void insert(com.company.types.CategoryContract entity) {
        
    }

    @Override
    public void insert(CategoryContract entity) {

    }

    @Override
    public List<CategoryContract> getAll() {
        return null;
    }

    @Override
    public CategoryContract delete(CategoryContract entity) {
        return null;
    }

    @Override
    public void update(CategoryContract entity) {

    }

    @Override
    public List<CategoryContract> getById(int id) {
        return null;
    }
}
