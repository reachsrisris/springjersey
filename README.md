# Spring Jersey & Swagger Integration Project

1. Create a SpringBoot Starter Project

2. Add Jersey Starter Dependency for writing JAX- RS(Jersey) Restful services

3. Create a New Class JerseyConfig <br />
  <code> public class JerseyConfig extends ResourceConfig </code>
  
4. Register Restful Service in the constructor  <br/>
  <code> 
    public JerseyConfig() {
		  register(WelcomeResource.class);
      register(ToDoResource.class);

	} 
  </code>
  
5. Add  Swagger for Jersey dependency in the POM.xml
  <code>
   <dependency>
			<groupId>io.swagger</groupId>
			<artifactId>swagger-jersey2-jaxrs</artifactId>
			<version>1.5.16</version>
		</dependency>
    </code>
    
6. Add configureSwagger to register ApiListringResource and SwaggerSerializer Component Classes

  <code>
    	private void configureSwagger() {
		this.register(ApiListingResource.class);
		this.register(SwaggerSerializers.class);
		BeanConfig config = new BeanConfig();
		config.setConfigId("Springboot-Jersey-Swagger-Example");
		config.setTitle("Spring Boot + Jersey + Swagger Example");
		config.setVersion("v1");
		config.setContact("Sri Sris");
		config.setSchemes(new String[] { "http", "https" });
		config.setBasePath("/api");
		config.setResourcePackage("com.srisris.tapasya.springjersey");
		config.setPrettyPrint(true);
		config.setScan(true);
	}
  </code>
