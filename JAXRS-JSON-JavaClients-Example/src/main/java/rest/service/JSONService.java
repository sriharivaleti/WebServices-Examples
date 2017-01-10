package rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/json")
public class JSONService {
	@GET
	@Path("/getjson")
	@Produces(MediaType.APPLICATION_JSON)
	public UserBo getboInJSON() {

		UserBo bo = new UserBo();
		bo.setUsername("satyakaveti@gmail.com");
		bo.setPassword("XCersxg34CXeWER341DS@#we");
		return bo;
	}
	
	@POST
	@Path("/postjson")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(UserBo bo) {

		String result = "USER DATA SAVED!! " + bo;
		return Response.status(201).entity(result).build();

	}

}