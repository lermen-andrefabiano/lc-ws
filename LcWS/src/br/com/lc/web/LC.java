package br.com.lc.web;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("andre")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LC {
	
	// chamada do cliente - http://localhost:8888/LcWS/rest/andre
	@GET
	public String ola(){
		return "Olá Andre LC";
	}

}
