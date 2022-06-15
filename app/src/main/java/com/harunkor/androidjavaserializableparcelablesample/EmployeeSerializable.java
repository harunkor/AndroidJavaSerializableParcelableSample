package com.harunkor.androidjavaserializableparcelablesample;

import java.io.Serializable;

public class EmployeeSerializable implements Serializable {

    private String name;
    private int age;
    private String address;

    public  EmployeeSerializable(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
