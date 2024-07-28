package com;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGaming01 {
    public static void main(String args[]) {
        try ( var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // Launch a spring context
            // Configure the things which you want spring to manage. 
            // System.out.println(context.getBean("name"));
            // System.out.println(context.getBean("age")); 
            System.out.println(context.getBean("woah"));
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}
