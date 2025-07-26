package com.example;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import online.json.demos.JsonDemo;

@Path("/JsonData")
public class JsonDataRest {

	
	@Inject 
	JsonDemo jsond;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String data() {
		return jsond.getJsonValues();
	}
}
