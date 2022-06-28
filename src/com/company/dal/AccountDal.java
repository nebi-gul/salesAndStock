package com.company.dal;

import com.company.core.ObjectHelper;
import com.company.interfaces.Dalinterfaces;
import com.company.types.CategoryContract;

import java.util.List;

public class AccountDal<AccountsContract> extends ObjectHelper implements Dalinterfaces<AccountsContract> {
    @Override
    public void insert(CategoryContract entity) {

    }

    @Override
    public void insert(AccountsContract entity) {

    }

    @Override
    public List<AccountsContract> getAll() {
        return null;
    }

    @Override
    public AccountsContract delete(AccountsContract entity) {
        return null;
    }

    @Override
    public void update(AccountsContract entity) {

    }

    @Override
    public List<AccountsContract> getById(int id) {
        return null;
    }
}
