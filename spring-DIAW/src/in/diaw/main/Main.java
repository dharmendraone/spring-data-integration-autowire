package in.diaw.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.diaw.beans.Student;
import in.diaw.resources.SpringConfiguration;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Student std = context.getBean(Student.class);
		std.display();
	}

}
