package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;

import com.github.javafaker.Faker;
import com.github.javafaker.Internet.UserAgent;

import api.payload.UserPojo;

public class Commanfun {
	
   public static Faker faker;
   public static UserPojo userPayload;
	
   public static Logger logger;
   
	@BeforeClass
	public void setup() {
		
		faker = new Faker();
		userPayload = new UserPojo();	
		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUsername(faker.name().firstName());
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassword(faker.internet().password(5,10));
		userPayload.setPhone(faker.phoneNumber().cellPhone());
		
		//logs
		
		logger = LogManager.getLogger();
		
		//logger.debug("debugging......");
	}


}
