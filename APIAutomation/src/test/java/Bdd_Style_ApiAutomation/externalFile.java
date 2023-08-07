package Bdd_Style_ApiAutomation;

import static io.restassured.RestAssured.*;


import java.io.File;

import org.testng.annotations.Test;

public class externalFile {
	
	@Test
	public void createEmployeeFromJsonFile() {
		
		File jsonFile = new File("postData.json");
		
		given()
		.baseUri("https://dummy.restapiexample.com/")
		.header("Content-Type","application/json")//application/xml
		.body(jsonFile)
		.when().post("/api/v1/create")
		.prettyPrint();
		
	}

}
