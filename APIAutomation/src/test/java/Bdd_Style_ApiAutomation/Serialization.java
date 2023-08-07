package Bdd_Style_ApiAutomation;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class Serialization {
	
	// data is obtained
	
	@Test
	public void SerializationFlow() {
	
	Map<String, Object > jsonBody = new HashMap<String,Object>();
	
	List<String> skills = new ArrayList<String>();
	skills.add("Java");
	skills.add("API_Automation");
	
	jsonBody.put("first_name", "Sathik");
	jsonBody.put("last_name", "Sha");
	jsonBody.put("first_name", "Sathiksha@gmail.com");
	
	jsonBody.put("skills", skills); // Collection of data will represented as array 
	
	System.out.println(jsonBody);
	
	given()
	.baseUri("https://dummy.restapiexample.com/")
	.header("Content-Type","application/Json")
	.body(jsonBody).log().all()
	.when().post("api/v1/create")
	.then().log().all();
	
	}

}
