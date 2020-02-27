package com.br.ws;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/wsProdutos")
public class wsProdutos {
	
	@GET
	@Produces(MediaType.TEXT_HTML+ ";charset=utf-8")
	public String getJson() {
		return "SÓ O TESTE";
	}
}
