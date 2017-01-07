package services;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/students")
public class QueryParamwithDefaultvalueService {
	@GET
	@Produces("text/html")
	public Response getResultByPassingValue(@DefaultValue("1000") @QueryParam("rollno") String rollno,
			@DefaultValue("XXXX") @QueryParam("name") String name,
			@DefaultValue("XXXX") @QueryParam("address") String address) {
		String output = "<h1>QueryParamwithDefaultvalueService Example</h1>";
		output = output + "<br>Roll No : " + rollno;
		output = output + "<br>Name : " + name;
		output = output + "<br>Address : " + address;
		return Response.status(200).entity(output).build();
	}
}