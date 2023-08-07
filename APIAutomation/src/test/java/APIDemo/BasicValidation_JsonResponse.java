package APIDemo;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class BasicValidation_JsonResponse {
/*	
Testcode  status code
Log Response
Verifying Single content in response body
Verifying Multiple contents in response body
Setting Parameters & headers
	*/
	
	
	
	public void testStatusCode() {
		
		when()
		.get("https://dummy.restapiexample.com/api/v1/employee/4")
		.then()
		.statusCode(200);
		
	}
	
	
	public void logResponse()
	{
		
		given()
		.when()
		.get("https://demoqa.com/BookStore/v1/Books")
		.then()
		.statusCode(200)
		.log().all();
	}
	

	public void singleContent() // https://www.site24x7.com/tools/jsonpath-finder-validator.html- json path finder
	{
		
		given()
		.when()
		.get("https://demoqa.com/BookStore/v1/Books")
		.then()
		.statusCode(200)
		.log().all()
		.body("books[1].title", equalTo("Learning JavaScript Design Patterns"));
	}
	
	@Test
	public void multipleContent() // https://www.site24x7.com/tools/jsonpath-finder-validator.html- json path finder
	{
		
		given()
		.when()
		.get("https://demoqa.com/BookStore/v1/Books")
		.then()
		.statusCode(200)
		.log().all()
		.body("books", hasItems("A Working Introduction","Addy Osmani"));
	}
	
	

}
