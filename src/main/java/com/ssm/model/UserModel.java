package com.ssm.model;

/**
 * Created by beiwei on 2017/5/17.
 */
public class UserModel {
    /**
     * ID
     */
    private int id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
