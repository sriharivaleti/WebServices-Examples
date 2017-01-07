package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/country")
public class PathMethodLevelService {

	@GET
	@Produces("text/html")
	public Response selectCountry() {
		String output = " Default Country : <h1>INDIA</h1>";
		return Response.status(200).entity(output).build();

	}

	@GET
	@Path("/usa")
	@Produces("text/html")
	public Response selectUSA() {
		String output = "Selected Country : <h1>United States of America(USA)</h1>";
		return Response.status(200).entity(output).build();

	}

	@GET
	@Path("/uk")
	@Produces("text/html")
	public Response selectUK() {
		String output = "Selected Country : <h1>UNITED KINGDOM(UK)</h1>";
		return Response.status(200).entity(output).build();

	}
}