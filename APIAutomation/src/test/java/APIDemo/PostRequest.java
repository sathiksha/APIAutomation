package APIDemo;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostRequest {

    @SuppressWarnings("rawtypes")
    public static HashMap map = new HashMap();

    @SuppressWarnings("unchecked")
    @BeforeClass
    public void PostData() {
        map.put("FirstName", "Sathiksha");
        map.put("LastName", "SathikSha54");
        map.put("Email", "SathikSha@yopmail.com");
        map.put("Id", "S8090");

        RestAssured.baseURI = "https://dummy.restapiexample.com";
        RestAssured.basePath = "/api/v1";
    }

    @Test
    public void testPost() {
    	
        given().contentType("application/json").body(map)
                .when().post("/create")
                .then().statusCode(200)
                .and().body("data.FirstName", equalTo("Sathiksha"))
                .and().body("data.LastName", equalTo("SathikSha54"))
                .body("status", equalTo("success"))
                .body("message", equalTo("Successfully! Record has been added."))
                .log().body();
    }
}
