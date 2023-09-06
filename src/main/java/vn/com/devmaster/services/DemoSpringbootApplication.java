package vn.com.devmaster.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootApplication.class, args);
//		ApplicationContext context = SpringApplication.run(DemoSpringbootApplication.class,args);
//		ManagerStudent managerStudent=context.getBean(ManagerStudent.class);
//		managerStudent.getStudentsList().forEach(student -> System.out.println(student.toString()));
	}

}
