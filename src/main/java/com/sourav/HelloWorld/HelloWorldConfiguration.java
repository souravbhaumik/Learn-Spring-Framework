package com.sourav.HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String Name, int age, Address address) {};
record Address(String Street, String City, String State, String Country) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String Name() {
        return "Hello World";
    }

    @Bean
    public int Age() {
        return 27;
    }

    @Bean(name = "Sourav")
    public Person person() {
        var person = new Person("Tinni", 20, new Address("Neeladri", "Bangalore", "Karnataka", "India"));
        return person;
    }

    @Bean
    public Person person2MethodCall() {
        var person = new Person(Name(), Age(), address());
        return person;
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        var person = new Person(name, age, address3);
        return person;
    }

    @Bean
    public Person person4Qualifier(String name, int age, @Qualifier("addressQualifier")Address address3) {
        var person = new Person(name, age, address3);
        return person;
    }

    @Bean
    public Address address() {
        var address = new Address("Paushi", "Paushi", "West Bengal", "India");
        return address;
    }

    @Bean()
    @Primary
    public Address address2() {
        var address = new Address("Contai", "Contai", "West Bengal", "India");
        return address;
    }

    @Bean
    public Address address3() {
        var address = new Address("Barasat", "Barasat", "West Bengal", "India");
        return address;
    }

    @Bean
    @Qualifier("addressQualifier")
    public Address address4Qualifier() {
        var address = new Address("Behala", "Barasat", "West Bengal", "India");
        return address;
    }

}
