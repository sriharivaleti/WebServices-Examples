package client;

import endpoint.HelloWorld;
import endpoint.HelloWorldImplService;
public class WSImportClinet {
public static void main(String[] args) {
	HelloWorldImplService service = new HelloWorldImplService();
	HelloWorld helloWorld = service.getHelloWorldImplPort();
	String output =helloWorld.getHelloWorldMsg("Iam WSIMPORT Message");
	System.out.println(output);
	}
}
