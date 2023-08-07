package Bdd_Style_ApiAutomation;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PojoFLow2 {
	
	public static void main (String[] arg) throws JsonProcessingException {
		
		
		///UI irunthu vara data
		
		PojoFLow flow1 = new PojoFLow();
		
		flow1.setFirstName("Sathik");
		flow1.setLastName("Sha");
		flow1.setEmail("dsdfkd@gmail.com");
		flow1.setSkills(Arrays.asList("Java","Selenium"));
		
		System.out.println(flow1.getFirstName());
		System.out.println(flow1.getLastName());
		System.out.println(flow1.getEmail());
		System.out.println(flow1.getSkills());
		
		
		//How to Serialize a poja to object  or HOw to convert poja to object 
		//libary json data bind
		//poja class serialize 
		
		ObjectMapper mapper = new ObjectMapper();
		
	     String employeeJson =	mapper.writerWithDefaultPrettyPrinter().writeValueAsString(flow1);
	     System.out.println(employeeJson);
		
	}

}
