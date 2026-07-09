package com.cognizant.springlearn.model;

public class Country {
    private String code;
    private String name;

    public Country() {
        System.out.println("Inside Country Constructor.");
    }

    public String getCode() {
        System.out.println("Getting Code");
        return code;
    }

    public void setCode(String code) {
        System.out.println("Setting Code");
        this.code = code;
    }

    public String getName() {
        System.out.println("Getting Name");
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting Name");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}
