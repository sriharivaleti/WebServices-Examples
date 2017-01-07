package endpoint;

import javax.xml.ws.Endpoint;  
//Endpoint publisher  
public class HelloWorldPublisher{  
    public static void main(String[] args) {  
       Endpoint.publish("http://localhost:7771/ws/hellodoc", new HelloWorldImpl());  
       System.out.println("WSDL Published !!");
        }  
}  
