package Bdd_Style_ApiAutomation;

import java.util.List;

public class PojoFLow {
	
	
	private String firstName;
	private String lastName;
	private String email;
	private List skills; 
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List getSkills() {
		return skills;
	}
	
	public void setSkills(List skills) {
		this.skills = skills;
	}
	
	//bussiness logic


}
