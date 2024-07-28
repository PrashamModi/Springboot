package com;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component
// @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
// class NormalClass {
// }

// @Component
// @Lazy
// @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// class ProtypeClass {
// }

@Configuration
@ComponentScan
public class AppGaming03 {
    public static void main(String args[]) {
        System.out.println("first");
        try (var context = new AnnotationConfigApplicationContext(AppGaming03.class)) {
            
            // context.getBean(GamingConsole.class).up();
            // context.getBean(GameRunner.class).run();
            // System.out.println("Main method loaded");
            // context.getBean(B.class).doSomething();
            // System.out.println(context.getBean(NormalClass.class));
            // System.out.println(context.getBean(NormalClass.class));

            // System.out.println(context.getBean(ProtypeClass.class));
            // System.out.println(context.getBean(ProtypeClass.class));
        }
    }
}
