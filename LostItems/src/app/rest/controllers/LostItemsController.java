package app.rest.controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.components.LostItemsComponent;
import app.entity.Report;

@Component
@Path("/lostitems")
public class LostItemsController{ 
	@GET
	@Path("/report")
	//@Produces(MediaType.APPLICATION_JSON)
	public String makeReport(@QueryParam("name") String name)
	{
		return "report works";
	}
	
	@GET
	@Path("/find")
	public String findItem(@QueryParam("name") String name)
	{
		return "findItem works";
	}
	
	
	

}
