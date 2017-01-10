package services;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/rs")
public class HeaderParamService {

	@GET
	@Path("/headerparam")
	public Response getHeader(
			@HeaderParam("user-agent") String userAgent,
			@HeaderParam("Accept") String accept,
            @HeaderParam("Accept-Encoding") String encoding,
            @HeaderParam("Accept-Language") String lang) {
		
		String output = "<h1>@Headerparam Example</h1>";
		output = output+"<br>user-agent : "+userAgent;
		output = output+"<br>Accept : "+accept;
		output = output+"<br>Accept-Encoding : "+encoding;
		output = output+"<br>Accept-Language: "+lang;

		return Response.status(200)
			.entity(output)
			.build();

	}

}
