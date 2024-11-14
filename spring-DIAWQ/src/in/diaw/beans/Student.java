package in.diaw.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String name;
	private String email;
	@Autowired
	@Qualifier("addObj2")
	private Address address;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("Full name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Address: "+address);
	}

}
