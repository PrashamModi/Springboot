package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * InnerHelloWorldConfiguration
 */
record Person( String name, int age ) { }

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Prasham";
    }
    @Bean
    public int age() {
        return 22;
    }

    // @Bean
    public Person woah() {
        Person per = new Person("This is ", 23);
        System.out.println(per.name());
        System.out.println(per.age());
        return per;
    }
}
