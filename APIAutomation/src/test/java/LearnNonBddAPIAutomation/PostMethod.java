package LearnNonBddAPIAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostMethod {

	@Test
	public void creatAnEmployeeFlow() {
		
		RestAssured.baseURI ="https://dummy.restapiexample.com/";
		
		RequestSpecification requestSpecification = RestAssured.given().header("Content-Type","application/Json")
				.body("{\"FirstName\": \"Sathik33\"}");
		 Response response = requestSpecification.request(Method.POST,"api/v1/create");
          System.out.println(response.getStatusLine());
	}
}
