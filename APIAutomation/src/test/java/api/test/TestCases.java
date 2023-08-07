package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndPoints2;
import io.restassured.response.Response;

public class TestCases extends Commanfun {

	@Test(priority = 0)
	public void testPostUser() {

		logger.info("Creating user");
		Response response = UserEndPoints2.CreateUser(userPayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		response.body().prettyPrint();

		logger.info("User is created");

	}

	@Test(priority = 1)
	public void testGetuserByName() {

		logger.info(" Reading user info");
		Response response = UserEndPoints2.readUser(this.userPayload.getUsername());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("User info displayed");

	}

	@Test(priority = 2)
	public void testupdateUserByName() {

		logger.info("Updating the user");
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());

		Response response = UserEndPoints2.UpdateUser(userPayload.getUsername(), userPayload);
		response.then().log().body().statusCode(200);
		Assert.assertEquals(response.getStatusCode(), 200);
		response.body().prettyPrint();

		Response responseAfterUpdate = UserEndPoints2.readUser(userPayload.getUsername());
		Assert.assertEquals(responseAfterUpdate.getStatusCode(), 200);
		logger.info("The user has been updated");

	}

	@Test(priority = 3)
	public void testdeleteUserByName() {
		
		logger.info("Deleting the user");
		Response response = UserEndPoints2.deleteUser(this.userPayload.getUsername());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("User has been deleted");
	}

}
