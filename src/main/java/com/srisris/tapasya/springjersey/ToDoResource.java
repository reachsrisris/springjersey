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

@Api(value = "ToDo Resource", produces = "application/json")
@Component
@Path("/todo")
public class ToDoResource {

	@Autowired
	private ToDoRepository todoRepository;



	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response list() {

		
		return Response.ok(todoRepository.findAll(), MediaType.APPLICATION_JSON).build();
	}

//	@Path("/getTodo/{id}")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public ToDo getTodo(@PathParam("id") String id) {
//		for (ToDo tt : todoList) {
//			if (tt.getId().equals(id)) {
//				return tt;
//			}
//		}
//		return null;
//	}
//
//	@Path("/add")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@POST
//	public void addToDo(ToDo t) {
//		ToDo td = new ToDo();
//		td.setId(t.getId());
//		td.setSummary(t.getSummary());
//		td.setDescription(t.getDescription());
//		todoList.add(td);
//
//	}
//
//	@Path("/update")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@PUT
//	public void updateToDo(ToDo t) {
//
//		ListIterator<ToDo> iterator = todoList.listIterator();
//		while (iterator.hasNext()) {
//			ToDo next = iterator.next();
//			if (next.getId().equals(t.getId())) {
//				next.setId(t.getId());
//				next.setSummary(t.getSummary());
//				next.setDescription(t.getDescription());
//
//			}
//		}
//
//	}
//


}
