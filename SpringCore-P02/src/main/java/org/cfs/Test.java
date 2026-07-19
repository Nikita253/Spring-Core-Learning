package org.cfs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String []args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println("-----------------Bean File Loaded--------------");

        System.out.println("Sending Request....");
        System.out.println("---------------------First Call-----------------");
        Car car = context.getBean(Car.class);
        car.drive();
    }
}
