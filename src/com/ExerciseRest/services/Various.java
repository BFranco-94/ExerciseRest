package com.ExerciseRest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/services")
public class Various {
	
	@GET
	@Path("/obligame")
	public String mensaje(){
		return "Obligame perru!!!";
	}
}
