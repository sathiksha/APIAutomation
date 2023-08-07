package LearnNonBddAPIAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllPetDetails {
	
	@Test
	public void getAllDeatils() {
		
		RestAssured.baseURI ="https://demoqa.com/";
		RequestSpecification requestSpecification = RestAssured.given();
	 //   Response response =	requestSpecification.request(Method.GET,"v1/Books");//get all details
		 Response response =	requestSpecification.request(Method.GET,"v1/Books/isbn/9781449325862"); // get single details
	    System.out.println(response.asPrettyString());
	    System.out.println(response.getStatusLine());
	    System.out.println(response.getStatusCode());
	}

}
