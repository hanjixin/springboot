package com.example.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@PropertySource(value = {"classpath:person2.properties"} )
@Component
@ConfigurationProperties(prefix = "person2")
public class Person2 {
    String lastName;
    int age;


    Map<String,String> maps;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    List<String> list;

    @Override
    public String toString() {
        return "Person2{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", maps=" + maps +
                ", list=" + list +
                '}';
    }
}
