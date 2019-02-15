package com.movies.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/movies")
public class MoviesController {

	@GET
	@Produces("application/json")
	public String getMoviesList() {
		return "Welcome";
	}
}
