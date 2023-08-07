package LearnNonBddAPIAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutMethod {
	
	
	@Test
	public void updateAnEmployee() {
		
		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";
		
		RequestSpecification requestSpecification = RestAssured
		
	     .given()
		.header("Content-Type","application/Json")
		.body(" \"id\": 7,\r\n"
				+ "    \"employee_name\": \"Sathik77\",\r\n"
				+ "    \"employee_salary\": \"77\",\r\n"
				+ "    \"employee_age\": \"22\"");
	Response response =	requestSpecification.request(Method.PUT,"employess/122");
	
	response.body();
	
	System.out.println(response.asPrettyString());

	}
}