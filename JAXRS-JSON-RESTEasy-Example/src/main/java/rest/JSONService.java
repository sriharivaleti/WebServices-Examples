package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/rest/json")
public class JSONService {

	@GET
	@Path("/get")
	@Produces("application/json")
	public UserBo getUserBoInJSON() {

		UserBo bo = new UserBo();
		bo.setUsername("satyakaveti@gmail.com");
		bo.setPassword("XCersxg34CXeWER341DS@#we");
		
		return bo; 

	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response createUserBoInJSON(UserBo UserBo) {

		String result = "UserBo created : " + UserBo;
		return Response.status(201).entity(result).build();
		
	}
	
}