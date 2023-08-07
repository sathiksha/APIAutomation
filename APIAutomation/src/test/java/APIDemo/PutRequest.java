package APIDemo;

import java.util.HashMap;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class PutRequest {
	
	@SuppressWarnings("rawtypes")
	public static HashMap<String, String> map = new HashMap();
	int id =2;
	
	@BeforeTest
	public void putData() {
		
		    map.put("employee_name", "Sathiksha2");
	        map.put("employee_salary", "500000");
	        map.put("employee_age", "252");
	        
	        RestAssured.baseURI = "https://dummy.restapiexample.com";
	        RestAssured.basePath = "/api/v1";
	}

	@Test
	public void testPutRequest() {
		
		given()
		.contentType("application/json")
		.body(map)
		.when()
		.put("/update/" + id )
		.then()
		.statusCode(200)
		.log().all();
	}
}
