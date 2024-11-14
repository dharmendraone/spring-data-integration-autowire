package in.diaw.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private String name;
	private String email;
	@Autowired
	private Address address;
	@Autowired
	private Skills skills;
	
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
		System.out.println("Skills: "+skills);
	}

}
