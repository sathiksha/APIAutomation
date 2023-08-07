package Bdd_Style_ApiAutomation;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class JsonSchemaValidation {
	
	@Test(enabled =  false)
	public void ValidationUsingJsonSchema() {
		
		File inputJson = new File("src/test/resources/input.json");
		
		//Reader
		//Inputstream we can use
		
		RestAssured
		.given()
		.baseUri("https://dummy.restapiexample.com/")
		.header("Content-Type","application/json")
		.body(inputJson)
		.when().post("/api/v1/create")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
	}
	
	@Test
	public void ValidationUsingMatchesJsonSchema() {
		
        File inputJson = new File("src/test/resources/input.json");
		File inputSchema  = new File("src/test/resources/schema.json");
        
		RestAssured
		.given()
		.baseUri("https://dummy.restapiexample.com/")
		.header("Content-Type","application/json")
		.body(inputJson)
		.when().post("/api/v1/create")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema(inputSchema));
		
	}
}
