package com.example;

import org.model.User; // ✅ Corrected package import
import org.services.UserService; // ✅ Corrected package import

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
public class UsersApi {

	@Inject
	private UserService us;

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML }) // ✅ More common than Atom + HTML
	public List<User> getUsers() {
		return us.getUsers();
	}

	
}