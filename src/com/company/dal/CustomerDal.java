package com.company.dal;

import com.company.core.ObjectHelper;
import com.company.interfaces.Dalinterfaces;
import com.company.types.CategoryContract;

import java.util.List;

public class CustomerDal<CustomerContract> extends ObjectHelper implements Dalinterfaces<CustomerContract> {
    @Override
    public void insert(CategoryContract entity) {

    }

    @Override
    public void insert(CustomerContract entity) {

    }

    @Override
    public List<CustomerContract> getAll() {
        return null;
    }

    @Override
    public CustomerContract delete(CustomerContract entity) {
        return null;
    }

    @Override
    public void update(CustomerContract entity) {

    }

    @Override
    public List<CustomerContract> getById(int id) {
        return null;
    }
}
