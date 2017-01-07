package services;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
 
@Path("/students")
public class QueryParamService {
	
	@GET
	@Produces("text/html")
	public Response getResultByPassingValue(
					@QueryParam("rollno") String rollno,
					@QueryParam("name") String name,
					@QueryParam("address") String address) {		
		String output = "<h1>QueryParamService Example</h1>";
		output = output+"<br>Roll No : "+rollno;
		output = output+"<br>Name : "+name;
		output = output+"<br>Address : "+address;
		 
		return Response.status(200).entity(output).build();
 
	}
}