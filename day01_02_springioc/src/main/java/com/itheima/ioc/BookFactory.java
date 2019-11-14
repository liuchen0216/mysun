package com.itheima.ioc;

public class BookFactory {
    // 静态工厂: 不需要创建BookFactory的实例,直接调用BookFactory的一个静态的方法
    public static Book getBook1(){
        return new Book();
    }
    // 实力化工厂:先要创建一个BookFactory的实例,再来调用BookFactory实力的一个非静态方法
    public Book getBook2(){
        return new Book();
    }
    // 区别: 是否要创建工厂的实例!

}
