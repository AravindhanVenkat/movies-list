package com.movies.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class MoviesController {

	@Path("movies")
	@GET
	@Produces("application/json")
	public String getMoviesList() {
		return "Welcome";
	}
	
	@Path("mmm")
	@GET
	@Produces("application/json")
	public String getMoviesList_1() {
		return "Second List";
	}
}
