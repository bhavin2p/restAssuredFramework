package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetData2 {
	@Test
	public void testResponseCode() {
		int code = get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=fbf24a58b927399881b5e262335fd908").getStatusCode();
		//String data = resp.asString();
		System.out.println("Status code is " +code);
		Assert.assertEquals(code, 200);
	}

}
