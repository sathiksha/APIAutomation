package APIDemo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteRequest {

	@Test
	public void DeleteRequestTest() {
		
		RestAssured.baseURI = "https://dummy.restapiexample.com";
		RestAssured.basePath = "/api/v1";
		
		Response response  = 
		
		given()
		.when()
		.delete("/delete/2")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.log().all()
		.extract().response(); // it will give the complete the response
		
	    String 	JsonAsString = response.asString();      // convert json to string
	    Assert.assertEquals(JsonAsString.contains("Successfully! Record has been deleted"),true);
	}
}
