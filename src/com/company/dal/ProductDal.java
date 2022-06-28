package com.company.dal;

import com.company.core.ObjectHelper;
import com.company.interfaces.Dalinterfaces;
import com.company.types.CategoryContract;

import java.util.List;

public class ProductDal<ProductContract> extends ObjectHelper implements Dalinterfaces <ProductContract>{
    @Override
    public void insert(CategoryContract entity) {

    }

    @Override
    public void insert(ProductContract entity) {

    }

    @Override
    public List<ProductContract> getAll() {
        return null;
    }

    @Override
    public ProductContract delete(ProductContract entity) {
        return null;
    }

    @Override
    public void update(ProductContract entity) {

    }

    @Override
    public List<ProductContract> getById(int id) {
        return null;
    }
}
