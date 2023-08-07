package APIDemo;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class GetRequest {
	
	
	
	@Test
	public void GetDetails() {
		
	    given()
	    .when()
	    .get("https://demoqa.com/BookStore/v1/Books")
	    .then()
	    .statusCode(200)
	    .statusLine("HTTP/1.1 200 OK")
	    .assertThat()
	    .body("books[0].title", equalTo("Git Pocket Guide")) 
	    .body("books[0].author", equalTo("Richard E. Silverman")) 
	    .body("books[0].pages", equalTo(234))
	    .body("books[0].title", not(equalTo("Other Book Title")))
	   // .time(Matchers.lessThanOrEqualTo(1500L), TimeUnit.MILLISECONDS)
	    .header("Content-Type","application/json; charset=utf-8")
	    .log().body();
	}




}
