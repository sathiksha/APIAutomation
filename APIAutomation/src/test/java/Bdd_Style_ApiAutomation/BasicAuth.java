package Bdd_Style_ApiAutomation;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BasicAuth {
	
	
	@Test
	public void basicAuthflow() {
		
		given()
		.auth()
		 .basic("postman", "password")
		.baseUri("https://postman-echo.com/")
		.when()
		.get("basic-auth")
		.prettyPrint();
	}

}
