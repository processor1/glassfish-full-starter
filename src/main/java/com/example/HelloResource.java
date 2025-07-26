package com.example;

import jakarta.ejb.EJB;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @EJB
    HelloBean helloBean;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return helloBean.sayHello();
    }
}
