import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Learn {

	@Test
	void test() {
		Response response=get("https://reqres.in/api/users?page=2");
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getTime());
	}
	
	@Test
	void Test2()
	{
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).
		body("data.id[1]", equalTo(8));
	}
}
