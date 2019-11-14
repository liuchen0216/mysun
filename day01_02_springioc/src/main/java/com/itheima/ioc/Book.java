package com.itheima.ioc;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Book {
    private String name;
    private float price;
    private Student student;


    private String[] array;
    private List<String> list;
    private Set<String> set;


    private Map<String,String> map;
    private Properties properties;

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Book(String name, float price, Student student) {
        this.name = name;
        this.price = price;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book() {
        System.out.println("正在创建Book....");
    }
    public void desc(){
        System.out.println("这是一本肉翔宝典");
    }
}
