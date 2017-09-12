package com.srisris.tapasya.springjersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig(){
		register(WelcomeResource.class);
		register(ToDoResource.class);
		
	}

}
