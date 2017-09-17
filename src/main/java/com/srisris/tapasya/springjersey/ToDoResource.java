package com.srisris.tapasya.springjersey;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.srisris.tapasya.springjersey.repository.ToDoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "ToDo Resource", produces = "application/json")
@Component
@Path("/todo")
public class ToDoResource {

	@Autowired
	private ToDoRepository todoRepository;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "This Operation lists all the ToDo's in the DB")
	public Response list() {

		return Response.ok(todoRepository.findAll(), MediaType.APPLICATION_JSON).build();
	}

	@Path("/show/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "This Operations find ToDo by ID specified")
	public ToDo show(@PathParam("id") String id) {
		return todoRepository.findOne(id);
	}

	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	@ApiOperation(value = "Adds a new ToDo in the DB")
	public Response save(ToDo t) {

		todoRepository.save(t);
		return Response.ok(todoRepository.findOne(t.getId()), MediaType.APPLICATION_JSON).build();

	}
	//
	// @Path("/update")
	// @Consumes(MediaType.APPLICATION_JSON)
	// @PUT
	// public void updateToDo(ToDo t) {
	//
	// ListIterator<ToDo> iterator = todoList.listIterator();
	// while (iterator.hasNext()) {
	// ToDo next = iterator.next();
	// if (next.getId().equals(t.getId())) {
	// next.setId(t.getId());
	// next.setSummary(t.getSummary());
	// next.setDescription(t.getDescription());
	//
	// }
	// }
	//
	// }
	//

}
