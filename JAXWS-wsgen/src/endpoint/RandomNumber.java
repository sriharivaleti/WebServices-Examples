package endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class RandomNumber {
	@WebMethod
	public String getRandomNumber() {
		return "Random Number Is : " + Math.random();
	}
}