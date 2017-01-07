package services;
 
import javax.ws.rs.FormParam; 
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
@Path("/students")
public class FormParamService {
	
	@POST
	@Path("/registerStudent")
	@Produces("text/html")
	public Response getResultByPassingValue(
			@FormParam("rollno") String rollno,
			@FormParam("name") String name,
			@FormParam("address") String address) {
		
		String output = "<h1>@FormParam Example - REGISTRATION COMPLETED!!!</h1>";
		output = output+"<br>Roll No : "+rollno;
		output = output+"<br>Name : "+name;
		output = output+"<br>Address : "+address;		 
		return Response.status(200).entity(output).build();
	}
}
 