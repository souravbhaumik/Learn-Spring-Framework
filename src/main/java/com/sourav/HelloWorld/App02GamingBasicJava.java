package com.sourav.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02GamingBasicJava {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class))
        {
            System.out.println(context.getBean("Name"));
            System.out.println(context.getBean(Integer.class));
            System.out.println(context.getBean("Sourav"));
            System.out.println(context.getBean(Address.class));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person4Qualifier"));
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
