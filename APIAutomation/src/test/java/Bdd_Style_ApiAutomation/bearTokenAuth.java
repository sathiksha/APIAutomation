package Bdd_Style_ApiAutomation;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class bearTokenAuth {
	
	@Test
	public void bearTokenAuthFlow() {
		
		//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
		
		String token = "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";
		
		given()
		.header("Authorization","Bearer "+token)
		.when()
		.get("https://api.github.com/user/repos")
		.body().prettyPrint();
		
	}

}
