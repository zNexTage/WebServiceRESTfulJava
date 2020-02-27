package com.br.ws;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/wsUsuarios")
public class wsUsuarios {
	@GET
	@Produces(MediaType.APPLICATION_JSON+ ";charset=utf-8")
	public String getUsuarios() {
		return "USUARIO"; 
	}
}
