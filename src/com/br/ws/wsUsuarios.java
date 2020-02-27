package com.br.ws;


import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.br.model.Usuarios;
import com.br.rn.RnUsuario;
import com.google.gson.Gson;

@Path("/wsUsuarios")
public class wsUsuarios {
	@GET
	@Produces(MediaType.APPLICATION_JSON+ ";charset=utf-8")
	public String getUsuarios() {
		ArrayList<Usuarios> listUsuarios;
		RnUsuario rnUsuario;
		String json = "";
		
		try {
			listUsuarios = new RnUsuario().getUsuarios(false);
			
			json = new Gson().toJson(listUsuarios);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return json;
	}
}
