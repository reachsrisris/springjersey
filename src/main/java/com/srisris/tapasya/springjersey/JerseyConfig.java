package com.srisris.tapasya.springjersey;

import javax.annotation.PostConstruct;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(WelcomeResource.class);
		register(ToDoResource.class);

	}

	@PostConstruct
	public void init() {
		this.configureSwagger();

	}

	private void configureSwagger() {
		this.register(ApiListingResource.class);
		this.register(SwaggerSerializers.class);
		BeanConfig config = new BeanConfig();
		config.setConfigId("Springboot-Jersey-Swagger-Example");
		config.setTitle("Spring Boot + Jersey + Swagger Example");
		config.setVersion("v1");
		config.setContact("Sri Chinthalapudi");
		config.setSchemes(new String[] { "http", "https" });
		config.setBasePath("/api");
		config.setResourcePackage("com.srisris.tapasya.springjersey");
		config.setPrettyPrint(true);
		config.setScan(true);
	}

}
