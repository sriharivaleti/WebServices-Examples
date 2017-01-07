package services;
 
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
@Path("/students")
public class MatrixParamService{	
	@GET
	@Produces("text/html")
	public Response getResultByPassingValue(
			@MatrixParam("rollno") String rollno,
			@MatrixParam("name") String name,
			@MatrixParam("address") String address) {
		
		String output = "<h1>@MatrixParam Example</h1>";
		output = output+"<br>Roll No : "+rollno;
		output = output+"<br>Name : "+name;
		output = output+"<br>Address : "+address;		 
		return Response.status(200).entity(output).build(); 
	}
}
