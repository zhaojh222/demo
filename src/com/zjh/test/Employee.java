package com.zjh.test;

import java.io.Serializable;

/**
 * Created by jiazhao on 5/10/18.
 */

public class Employee implements Serializable{

    private int id;
    private String name;

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
}
