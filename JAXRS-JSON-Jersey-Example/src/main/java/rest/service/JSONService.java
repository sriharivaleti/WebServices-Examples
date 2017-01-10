package rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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

}