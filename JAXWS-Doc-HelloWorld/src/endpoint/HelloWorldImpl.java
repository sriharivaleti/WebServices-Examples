package endpoint;

import javax.jws.WebService;  
//Service Implementation  
@WebService(endpointInterface = "endpoint.HelloWorld")  
public class HelloWorldImpl implements HelloWorld{
	@Override
	public String getHelloWorldMsg(String msg) {
		// TODO Auto-generated method stub
		return "Your Message from WebService is : "+msg;
	}     
}  
