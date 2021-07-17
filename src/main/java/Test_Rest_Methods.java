import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_Rest_Methods {
	
	//@Test
//	public void Test_01_GET() {
//		
////		JSONObject request=new JSONObject();
////		request.
//		
//		given().
//		get("https://reqres.in/api/users?page=2").
//		then().
//		statusCode(200).
//		log().all();
//		
//	}

	
	@Test
	public void Test_02_POST() {
		
		JSONObject request = new JSONObject();
		request.put("name", "Vinayak");
		request.put("job", "Patil");
		
		given()
		.header("content-type","application/json")
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201);
		
	}
	
	@Test
	public void Test_03_Put() {
		
		JSONObject request = new JSONObject();
		request.put("name", "Vinayak");
		request.put("job", "Patil");
		
		given().header("content-type","application/json").
		body(request.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200);
		
	}
	
	@Test
	public void Test_04_Patch() {
		
		JSONObject request = new JSONObject();
		request.put("name", "Vinayak");
		request.put("job", "Patil");
		
		given().header("content-type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		patch("https://reqres.in/api/users/2").
		then().
		statusCode(200);
		
	}









}

