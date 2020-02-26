package com.my.demo1;

public class UserDaoMysqlImpl implements UserDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void initDao()
    {
        System.out.println("init----------");
    }

    public void destroyDao()
    {
        System.out.println("destroy--------");
    }

    @Override
    public void save() {
        System.out.println(name);
        System.out.println("mysql-----save");
    }

    @Override
    public void delete() {
        System.out.println("mysql-----delete");
    }
}
