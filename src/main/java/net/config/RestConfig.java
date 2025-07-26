package net.config;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("api") // <-- Missing @ symbol
public class RestConfig extends Application {
	
}

