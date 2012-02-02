package com.barcrawl.rs.application;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.barcrawl.domain.User;

@Path("/users")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class UserController {
	@GET
	@Path("/{id}")
	public User getUser(@PathParam("id") String id){
		return new User();
	}
}
