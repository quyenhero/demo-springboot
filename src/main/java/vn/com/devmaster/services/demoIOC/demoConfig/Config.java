package vn.com.devmaster.services.demoIOC.demoConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {
    @Bean
    ManagerStudent student(){
        Student student = Student.builder().name("Abc").age(20).build();
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student);
        studentList.add(student);
        ManagerStudent managerStudent = new ManagerStudent();
        managerStudent.setStudentsList(studentList);
        return  managerStudent;
    }
}
