package com.yammer.dropwizarddemo.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/greetings/{name}")
public class HelloWorld {
    @GET
    public String getGreetings(@PathParam("name") String name){
        return "Hello, "+ name +" !";
    }
}
