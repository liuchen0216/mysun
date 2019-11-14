package com.itheima.test;

import com.itheima.ioc.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        // 读取配置文件,初始化spring的IOC容器
     ApplicationContext act
             = new ClassPathXmlApplicationContext("bean1","bean2");
            //= new FileSystemXmlApplicationContext("E:\\ClassFile\\spring\\day01_02_springioc");
     // 调用容器的getBean方法获取对象
        //1使用bean的   id   作为条件获取对象
        // Book book = (Book) act.getBean("book");
        //2 使用bean的   class   作为参数获取对象(最多,慎重)
        // Book book = act.getBean(Book.class);
        // 3 使用bean的id 和class 作为参数获取对象
        Book book1 = act.getBean(Book.class);
        Book book2 = act.getBean(Book.class);
        System.out.println(book1);
        System.out.println(book2);


    }
}
