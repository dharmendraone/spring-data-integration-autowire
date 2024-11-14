package in.aw.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.aw.beans.Student;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("in/aw/resources/applicationContext.xml");
		Student studentbean = (Student)context.getBean("stdid");
		studentbean.display();
	}

}
