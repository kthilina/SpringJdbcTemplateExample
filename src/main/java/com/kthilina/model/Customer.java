package com.kthilina.model;

import java.io.Serializable;

public class Customer implements Serializable {
    private long id;
    private String name;
    private String tel;

    public Customer() {
    }

    public Customer(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public Customer(long id, String name, String tel) {
        this.id = id;
        this.name = name;
        this.tel = tel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
