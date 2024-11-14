package in.diaw.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.diaw.beans.Address;
import in.diaw.beans.Skills;
import in.diaw.beans.Student;

@Configuration
public class SpringConfiguration {

	@Bean
	public Address addObj() {
		Address add = new Address();
		add.setArea("Kolar colony");
		add.setCity("Bhopal");
		add.setPincode(462016);

		return add;
	}
	
	@Bean
	public Skills skillObj() {
		Skills skill = new Skills();
		List<String> skill_list = new ArrayList<String>();
		skill_list.add("Java");
		skill_list.add("Python");
		skill_list.add("PHP");
		skill.setName(skill_list);
		
		return skill;
		
	}

	@Bean
	public Student stdObj() {
		Student std = new Student();
		std.setName("Dharmendra Patel");
		std.setEmail("dharmendra@gmail.com");
		
		return std;
	}
}
