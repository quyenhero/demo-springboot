package vn.com.devmaster.services.demo.respository;

import org.springframework.stereotype.Repository;
import vn.com.devmaster.services.demo.domain.Student;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DemoRepository {
    public List<Student> getAll(){
        Student student = Student.builder().firstName("ABC").lastName("CBD").age(20).address("HN").build();
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student);
        students.add(student);
        return students;
    }
    public Student getOne(String userName){
        Student student = Student.builder().firstName("ABC").lastName("CBD").age(20).address("HN").userName(userName).password("123456789").build();
        return student;
    }
    public List<Student> getStudentByName(String name){
        Student student = Student.builder().firstName("Hoàng").lastName("Nguyễn").age(20).address("HN").userName("abcd").password("123456789").build();
        Student student1 = Student.builder().firstName("Sơn").lastName("Tạ").age(20).address("HN").userName("abc").password("123456789").build();
        Student student2 = Student.builder().firstName("Linh").lastName("Hoàng").age(20).address("HN").userName("ab").password("123456789").build();
        Student student3 = Student.builder().firstName("Sơn").lastName("Nguyễn").age(20).address("HN").userName("a").password("123456789").build();

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        String lName="";
        String[] arStr = name.split("\\ ");
        String fName = arStr[0];
        for (int i = 1; i < arStr.length; i++) {
            lName=lName+" "+arStr[i];
        }

        List<Student> list = new ArrayList<>();

        for (Student std : students) {
            if (std.getFirstName().equals(fName)) {
                list.add(std);
            }
        }
        return list;
    }
    public Student getStudentByUsernamePassword(String username,String password){
        Student student = Student.builder().firstName("ABC").lastName("CDE").age(20).address("HN").userName("abcd").password("123456789").build();
        Student student1 = Student.builder().firstName("ABC").lastName("CDE").age(20).address("HN").userName("abc").password("12345678").build();
        Student student2 = Student.builder().firstName("ABC").lastName("CDE").age(20).address("HN").userName("ab").password("1234567").build();
        Student student3 = Student.builder().firstName("ABC").lastName("CDE").age(20).address("HN").userName("a").password("123456").build();
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student std : students) {
            if (std.getUserName().equals(username) && std.getPassword().equals(password)) {
                return std;
            }
            continue;
        }
        return null;
    }
}
