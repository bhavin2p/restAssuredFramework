package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetData {
	@Test
	public void testResponseCode() {
		Response resp = get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=fbf24a58b927399881b5e262335fd908");
		int code = resp.getStatusCode();
		String data = resp.asString();
		System.out.println("Status code is " +data);
		Assert.assertEquals(code, 200);
	}

}
