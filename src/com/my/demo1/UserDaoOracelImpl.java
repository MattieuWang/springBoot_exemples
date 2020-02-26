package com.my.demo1;

public class UserDaoOracelImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("oracel-----save");

    }

    @Override
    public void delete() {
        System.out.println("oracel-----delete");

    }
}
