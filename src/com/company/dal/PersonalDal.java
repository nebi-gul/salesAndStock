package com.company.dal;

import com.company.core.ObjectHelper;
import com.company.interfaces.Dalinterfaces;
import com.company.types.CategoryContract;

import java.util.List;

public class PersonalDal<PersonalContract>extends ObjectHelper implements Dalinterfaces<PersonalContract> {
    @Override
    public void insert(CategoryContract entity) {

    }

    @Override
    public void insert(PersonalContract entity) {

    }

    @Override
    public List<PersonalContract> getAll() {
        return null;
    }

    @Override
    public PersonalContract delete(PersonalContract entity) {
        return null;
    }

    @Override
    public void update(PersonalContract entity) {

    }

    @Override
    public List<PersonalContract> getById(int id) {
        return null;
    }
}
