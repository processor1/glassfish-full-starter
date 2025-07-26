package org.services;

import java.util.ArrayList;
import java.util.List;

import org.model.Gender;
import org.model.User;

import jakarta.ejb.Stateless;

@Stateless
public class UserService {

	public List<User> getUsers() {

		List<User> allUsers = new ArrayList<>();

		allUsers.add(createUser("U001", "John Doe", "john123", 28, "pass1", Gender.MALE));
		allUsers.add(createUser("U002", "Jane Smith", "jane_smith", 25, "pass2", Gender.FEMALE));
		allUsers.add(createUser("U003", "Kwame Nkrumah", "kwame_nk", 35, "pass3", Gender.MALE));
		allUsers.add(createUser("U004", "Akosua Boateng", "akosua", 22, "pass4", Gender.FEMALE));
		allUsers.add(createUser("U005", "Michael Owusu", "mikeo", 30, "pass5", Gender.MALE));
		allUsers.add(createUser("U006", "Abena Osei", "abenaosei", 26, "pass6", Gender.FEMALE));
		allUsers.add(createUser("U007", "Daniel Asamoah", "danny", 29, "pass7", Gender.MALE));
		allUsers.add(createUser("U008", "Esi Yankson", "esiy", 24, "pass8", Gender.FEMALE));
		allUsers.add(createUser("U009", "Kofi Mensah", "kofim", 32, "pass9", Gender.MALE));
		allUsers.add(createUser("U010", "Ama Serwaa", "amaserwaa", 27, "pass10", Gender.FEMALE));

		return allUsers;
	}

	private User createUser(String id, String fullname, String username, int age, String password, Gender gender) {
		User user = new User();
		user.setId(id);
		user.setFullname(fullname);
		user.setUsername(username);
		user.setAge(age);
		user.setPassword(password);
		user.setGender(gender);
		return user;
	}

	public User getUserById(String id) {
		for (User u : getUsers()) {
			if (u.getId().equals(id)) {
				return u;
			}
		}
		return null;
	}

	public User getUserByUsername(String username) {
		for (User u : getUsers()) {
			if (u.getUsername().equalsIgnoreCase(username)) {
				return u;
			}
		}
		return null;
	}
}
