package com.company.dal;

import com.company.core.ObjectHelper;
import com.company.interfaces.Dalinterfaces;
import com.company.types.CategoryContract;

import java.util.List;

public class StockDal<StockContract> extends ObjectHelper implements Dalinterfaces<StockContract> {
    @Override
    public void insert(CategoryContract entity) {

    }

    @Override
    public void insert(StockContract entity) {

    }

    @Override
    public List<StockContract> getAll() {
        return null;
    }

    @Override
    public StockContract delete(StockContract entity) {
        return null;
    }

    @Override
    public void update(StockContract entity) {

    }

    @Override
    public List<StockContract> getById(int id) {
        return null;
    }
}
