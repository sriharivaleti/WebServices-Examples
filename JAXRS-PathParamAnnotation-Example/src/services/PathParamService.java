package services;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
@Path("/students")
public class PathParamService {
	
	@GET
	@Path("{rollno}/{name}/{address}")
	@Produces("text/html")
	public Response getResultByPassingValue(
			@PathParam("rollno") String rollno,
					@PathParam("name") String name,
					@PathParam("address") String address) {		
		String output = "<h1>PathParamService Example</h1>";
		output = output+"<br>Roll No : "+rollno;
		output = output+"<br>Name : "+name;
		output = output+"<br>Address : "+address;		 
		return Response.status(200).entity(output).build(); 
	}
}
 