package com.ankit.jaxb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/todo")
public class TodoResource {

    @GET
    @Produces({MediaType.APPLICATION_XML})
    public Todo getXML() {
        Todo todo = new Todo();
        todo.setSummary("Application XML Todo Summary");
        todo.setDescription("Application XML Todo Description");
        return todo;
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Todo getJSON() {
        Todo todo = new Todo();
        todo.setSummary("Application JSON Todo Summary");
        todo.setDescription("Application JSON Todo Description");
        return todo;
    }

    @GET
    @Produces({ MediaType.TEXT_XML })
    public Todo getHTML() {
        Todo todo = new Todo();
        todo.setSummary("XML Todo Summary");
        todo.setDescription("XML Todo Description");
        return todo;
    }

}