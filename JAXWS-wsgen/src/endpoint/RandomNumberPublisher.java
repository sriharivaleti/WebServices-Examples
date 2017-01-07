package endpoint;
import javax.xml.ws.Endpoint;
public class RandomNumberPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/ws/wsgen", new RandomNumber());
		System.out.println("Service is published!");
	}
}
