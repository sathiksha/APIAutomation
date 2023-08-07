package api.endpoints;

import static io.restassured.RestAssured.given;

import java.util.Locale;
import java.util.ResourceBundle;

import api.payload.UserPojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


//perform Create ,Read,Update,Delete and implemented of End point

//get the data from the properties file

public class UserEndPoints2 {
	
	public static ResourceBundle getURL() {
		
		ResourceBundle routes = ResourceBundle.getBundle("routes", Locale.US);

		// ResourceBundle routes = ResourceBundle.getBundle("routes");
		 return routes;

	}
	
	public static Response CreateUser(UserPojo payload)
	{
	String post_url =	getURL().getString("post_url");
		
		Response  response =given()
		
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		  .body(payload)
		.when()
		  .post(post_url);
		return response;
			  
	}
	
	public static Response readUser(String userName)
	{
		String get_url =	getURL().getString("get_url");
		
		Response  response =given()
		.pathParam("username", userName)
		.when()
		  .get(Routes.get_url);
		return response;
			  
	}
	
	public static Response UpdateUser(String userName, UserPojo payload)
	{
		String update_url =	getURL().getString("update_url");
		
		Response  response =given()
		
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.pathParam("username", userName)
		  .body(payload)
		.when()
		  .put(update_url);
		return response;
			  
	}
	
	public static Response deleteUser(String userName)
	{
		String delete_url =	getURL().getString("delete_url");
		
		Response  response =given()
				.pathParam("username", userName)
		.when()
		  .delete(Routes.delete_url);
		return response;
			  
	}
	
	

}
