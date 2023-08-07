package Bdd_Style_ApiAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllEmployess {
	
	//When we use static import we don't use RestAssured method

	@Test(enabled = false)
	public void getAllEmployee() {

		RestAssured
		.given()
		  .baseUri("https://demoqa.com/BookStore/v1")
		.when()
		   .get("/Books")
		.prettyPrint();
		
	}
	
	@Test(enabled =  false)
	public void createAnEmployee() {
		
		RestAssured
		 .given()
		    .baseUri("https://dummy.restapiexample.com")
		  .header("Content-Type","applicatoin/json")
		  .body("{\"FirstName\": \"Sathik33\"}")
		  .when().post("/api/v1/create").prettyPrint();
			
	}
	
	@Test(enabled =  false)
	public void UpdateAnEmployee() {
		
		RestAssured
		 .given()
		    .baseUri("https://dummy.restapiexample.com")
		  .header("Content-Type","applicatoin/json")
		  .body(" \"id\": 3,\r\n"
					+ "    \"employee_name\": \"Sathik77\",\r\n"
					+ "    \"employee_salary\": \"77\",\r\n"
					+ "    \"employee_age\": \"22\"")
		  .when().put("/api/v1/employess/122").prettyPrint();
			
	}
	
	@Test
	public void deleteAnEmployee() {
		
		RestAssured
		 .given()
		    .baseUri("https://dummy.restapiexample.com") 
		  .when()
		  .delete("/api/v1/employess/122").prettyPrint();
			
	}
}
