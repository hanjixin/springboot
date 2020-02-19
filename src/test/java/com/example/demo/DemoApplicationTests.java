package com.example.demo;

import com.example.demo.model.Person;
import com.example.demo.model.Person2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    Person person;
    @Autowired
    Person2 person2;
    @Test
    void contextLoads() {
//        System.out.println(person.toString());
//        System.out.println(person2.toString());
    }

}
