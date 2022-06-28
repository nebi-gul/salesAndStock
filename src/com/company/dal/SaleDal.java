package com.company.dal;

import com.company.core.ObjectHelper;
import com.company.interfaces.Dalinterfaces;
import com.company.types.CategoryContract;

import java.util.List;

public class SaleDal<SaleContract> extends ObjectHelper implements Dalinterfaces<SaleContract> {
    @Override
    public void insert(CategoryContract entity) {

    }

    @Override
    public void insert(SaleContract entity) {

    }

    @Override
    public List<SaleContract> getAll() {
        return null;
    }

    @Override
    public SaleContract delete(SaleContract entity) {
        return null;
    }

    @Override
    public void update(SaleContract entity) {

    }

    @Override
    public List<SaleContract> getById(int id) {
        return null;
    }
}
