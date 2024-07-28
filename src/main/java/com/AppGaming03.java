package com;

// import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

class A {
    A() {
        // super();
        System.out.println("A constructor");
    }
}

@Component
class SomeDependency {
    SomeDependency(){
        System.out.println("It was also called");
    }
    public void getReady(SomeDependency someDependency) {
        System.out.println("Some Logic Of ready" + someDependency );
    }
}

@Component
class SomeClass extends A {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependency are ready!!" + this.someDependency);
    }

    @PostConstruct
    public void initialize() {
        someDependency.getReady(someDependency);
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Destroy!!");
    }
}



@Configuration
@ComponentScan
public class AppGaming03 {
    public static void main(String args[]) {
        System.out.println("first");
        try (var context = new AnnotationConfigApplicationContext(AppGaming03.class)) {
            // Arrays.stream(context.getBeanDefinitionNames());
        }
    }
}