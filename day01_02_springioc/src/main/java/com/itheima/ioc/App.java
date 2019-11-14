package com.itheima.ioc;

public class App {
    public static void main(String[] args) {
        //1. 直接使用new 关键字创建
        Book book1 = new Book();

        //2. 使用静态工厂创建
        Book book2 = BookFactory.getBook1();

        // 使用实例化工厂创建
        BookFactory bookFactory = new BookFactory();
        Book book3 = bookFactory.getBook2();
    }
}
