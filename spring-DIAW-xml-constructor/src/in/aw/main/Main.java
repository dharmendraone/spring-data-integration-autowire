package in.aw.main;

import in.aw.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("in/aw/resources/applicationContext.xml");
		Student stdbean = (Student)context.getBean("stdid");
		stdbean.display();
	}

}
