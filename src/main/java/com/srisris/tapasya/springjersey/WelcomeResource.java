package com.srisris.tapasya.springjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

import io.swagger.annotations.Api;
@Api(value = "Hello resource", produces = "application/text")
@Component
@Path("/welcome")
public class WelcomeResource {

	@GET
	public String message(){
		return "Hello Sri!!";
	}
}
