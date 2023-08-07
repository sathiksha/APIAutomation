package Bdd_Style_ApiAutomation;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class APiKeyAuth {

	//https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
	
	@Test
	public void APIKeyAuthFlow() {
		
		given()
		.queryParam("q", "Trichy")
		.queryParam("appid", "3a68d036a1dfe9bc8211d927751aa29f")
		// header("appid", "3a68d036a1dfe9bc8211d927751aa29f")
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather")
		.then()
		.log().body();
		
	}
}
