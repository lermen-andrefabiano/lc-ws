package br.com.lc.web;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("andre")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LC {

	// chamada do cliente - http://localhost:8888/LcWS/rest/andre
	@GET
	@Path("ola")
	public String ola() {
		return "Olá Andre LC";
	}

	@GET
	@Path("get")
	public AndreDTO get(@QueryParam("id") String id) {

		AndreDTO a = new AndreDTO();
		a.id = id;

		return a;
	}

	@GET
	@Path("listAll")
	public List<AndreDTO> listAll(@QueryParam("id") String id) {

		List<AndreDTO> retorno = new ArrayList<AndreDTO>();

		for (int i = 0; i <= 10; i++) {
			AndreDTO a = new AndreDTO();
			a.id = id;

			retorno.add(a);
		}

		return retorno;
	}

}
