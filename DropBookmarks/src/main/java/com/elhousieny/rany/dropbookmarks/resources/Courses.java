package com.elhousieny.rany.dropbookmarks.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/Courses")
public class Courses {

    @GET
    public String getCourses() {
        return "Those are list of Dropwizard courses";
    }
}
