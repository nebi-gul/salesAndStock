package com.company.core;

import com.company.interfaces.Coreinterfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ObjectHelper extends CoreFields  implements Coreinterfaces {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnnection() {
        Connection connection=null;

        try {
            connection= DriverManager.getConnection(getUrl(),getUserName(),getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public abstract void insert(com.company.types.CategoryContract entity);
}
