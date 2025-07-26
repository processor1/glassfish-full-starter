package com.example;

import java.util.List;

import org.model.User;
import org.services.UserService;

import jakarta.inject.Inject;
import jakarta.websocket.server.PathParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/usershtml")
public class UsersHTML {
	
	@Inject
	private UserService us;

	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getUsersAsHtml() {
		List<User> users = us.getUsers();

		StringBuilder html = new StringBuilder();
		html.append("<!DOCTYPE html>");
		html.append("<html lang='en'>");
		html.append("<head>");
		html.append("<meta charset='UTF-8'>");
		html.append("<title>User List</title>");
		html.append("<style>");
		html.append("body { font-family: Arial, sans-serif; background: #f4f6f9; margin: 0; padding: 20px; }");
		html.append("h1 { text-align: center; color: #333; }");
		html.append(
				"table { margin: auto; border-collapse: collapse; width: 80%; background: #fff; box-shadow: 0 2px 10px rgba(0,0,0,0.1); }");
		html.append("th, td { padding: 12px 15px; border: 1px solid #ccc; text-align: center; }");
		html.append("th { background-color: #3f51b5; color: white; }");
		html.append("tr:nth-child(even) { background-color: #f2f2f2; }");
		html.append("tr:hover { background-color: #e8f0fe; }");
		html.append("</style>");
		html.append("</head>");
		html.append("<body>");
		html.append("<h1>User List</h1>");
		html.append("<table>");
		html.append("<tr><th>ID</th><th>Full Name</th><th>Username</th><th>Age</th><th>Gender</th></tr>");

		for (User u : users) {
			html.append("<tr>").append("<td>").append(u.getId()).append("</td>").append("<td>").append(u.getFullname())
					.append("</td>").append("<td>").append(u.getUsername()).append("</td>").append("<td>")
					.append(u.getAge()).append("</td>").append("<td>").append(u.getGender()).append("</td>")
					.append("</tr>");
		}

		html.append("</table>");
		html.append("</body></html>");

		return html.toString();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.TEXT_HTML)
	public String getUserByIdAsHtml(@PathParam("id") String id) {
		User user = us.getUserById(id); // This method should return null if not found

		StringBuilder html = new StringBuilder();
		html.append("<!DOCTYPE html>");
		html.append("<html lang='en'>");
		html.append("<head>");
		html.append("<meta charset='UTF-8'>");
		html.append("<title>User Details</title>");
		html.append("<style>");
		html.append("body { font-family: Arial, sans-serif; background: #f4f6f9; margin: 0; padding: 20px; }");
		html.append(
				".card { max-width: 500px; margin: auto; background: white; padding: 20px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); border-radius: 10px; }");
		html.append("h2 { text-align: center; color: #333; }");
		html.append("p { font-size: 16px; color: #555; line-height: 1.5; }");
		html.append("</style>");
		html.append("</head><body>");

		if (user != null) {
			html.append("<div class='card'>");
			html.append("<h2>User Details</h2>");
			html.append("<p><strong>ID:</strong> ").append(user.getId()).append("</p>");
			html.append("<p><strong>Full Name:</strong> ").append(user.getFullname()).append("</p>");
			html.append("<p><strong>Username:</strong> ").append(user.getUsername()).append("</p>");
			html.append("<p><strong>Age:</strong> ").append(user.getAge()).append("</p>");
			html.append("<p><strong>Gender:</strong> ").append(user.getGender()).append("</p>");
			html.append("</div>");
		} else {
			html.append("<div class='card'><h2>User Not Found</h2><p>No user with ID: ").append(id)
					.append("</p></div>");
		}

		html.append("</body></html>");
		return html.toString();
	}

	@GET
	@Path("/username/{username}")
	@Produces(MediaType.TEXT_HTML)
	public String getUserByUsernameAsHtml(@PathParam("username") String username) {
		User user = us.getUserByUsername(username); // Custom method using username

		StringBuilder html = new StringBuilder();
		html.append("<!DOCTYPE html>");
		html.append("<html lang='en'>");
		html.append("<head>");
		html.append("<meta charset='UTF-8'>");
		html.append("<title>User Details</title>");
		html.append("<style>");
		html.append("body { font-family: Arial, sans-serif; background: #f4f6f9; margin: 0; padding: 20px; }");
		html.append(
				".card { max-width: 500px; margin: auto; background: white; padding: 20px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); border-radius: 10px; }");
		html.append("h2 { text-align: center; color: #333; }");
		html.append("p { font-size: 16px; color: #555; line-height: 1.5; }");
		html.append("</style>");
		html.append("</head><body>");

		if (user != null) {
			html.append("<div class='card'>");
			html.append("<h2>User Details</h2>");
			html.append("<p><strong>ID:</strong> ").append(user.getId()).append("</p>");
			html.append("<p><strong>Full Name:</strong> ").append(user.getFullname()).append("</p>");
			html.append("<p><strong>Username:</strong> ").append(user.getUsername()).append("</p>");
			html.append("<p><strong>Age:</strong> ").append(user.getAge()).append("</p>");
			html.append("<p><strong>Gender:</strong> ").append(user.getGender()).append("</p>");
			html.append("</div>");
		} else {
			html.append("<div class='card'><h2>User Not Found</h2><p>No user with username: ").append(username)
					.append("</p></div>");
		}

		html.append("</body></html>");
		return html.toString();
	}

}
