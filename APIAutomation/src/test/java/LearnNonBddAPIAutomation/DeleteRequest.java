package LearnNonBddAPIAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequest {
	
	@Test
	public void deleteAnEmployee() {

		RestAssured.baseURI ="https://dummy.restapiexample.com/api/v1";
		
		RequestSpecification requestSpecification = RestAssured.given();
		
		Response response = requestSpecification.request(Method.DELETE,"/delete/4");
		
		System.out.println(response.asPrettyString());	
	
	}

}
