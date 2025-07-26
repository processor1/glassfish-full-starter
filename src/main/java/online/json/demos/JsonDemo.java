package online.json.demos;

import jakarta.json.*;
import jakarta.ejb.*;

@Stateless
public class JsonDemo {

	public String getJsonValues() {

		JsonObject data = Json.createObjectBuilder().add("Name", "James").add("Age", 40)
				.add("Date", java.time.LocalDateTime.now().toString()).build();
		return data.toString();
	}
}
