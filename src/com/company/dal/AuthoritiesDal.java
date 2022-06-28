package com.company.dal;

import com.company.core.ObjectHelper;
import com.company.interfaces.Dalinterfaces;
import com.company.types.CategoryContract;

import java.util.List;

public class AuthoritiesDal<AuthoritiesContract> extends ObjectHelper implements Dalinterfaces<AuthoritiesContract> {
    @Override
    public void insert(CategoryContract entity) {

    }

    @Override
    public void insert(AuthoritiesContract entity) {

    }

    @Override
    public List<AuthoritiesContract> getAll() {
        return null;
    }

    @Override
    public AuthoritiesContract delete(AuthoritiesContract entity) {
        return null;
    }

    @Override
    public void update(AuthoritiesContract entity) {

    }

    @Override
    public List<AuthoritiesContract> getById(int id) {
        return null;
    }
}
