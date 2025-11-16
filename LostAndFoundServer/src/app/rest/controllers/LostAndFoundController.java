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

import app.components.LostAndFoundComponent;
import app.entity.Location;

@Component
@Path("/lostandfound")
public class LostAndFoundController{ 
	
	@Autowired
    private LostAndFoundComponent lafComponent;
	
	
	@GET
	@Path("/findloc")
	public String findLocation(@QueryParam("id") Long id)
	{
		Location location = lafComponent.findLocationById(id);
		return location.getName();
	}
	
	

}