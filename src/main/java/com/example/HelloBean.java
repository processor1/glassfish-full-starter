package com.example;

import jakarta.ejb.Stateless;

@Stateless
public class HelloBean {
    public String sayHello() {
        return "Hello from EJB!";
    }
}
