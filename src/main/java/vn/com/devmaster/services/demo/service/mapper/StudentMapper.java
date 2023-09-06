package vn.com.devmaster.services.demo.service.mapper;

import org.springframework.stereotype.Component;
import vn.com.devmaster.services.demo.domain.Student;
import vn.com.devmaster.services.demo.service.dto.StudentDTO;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentMapper {
    public StudentDTO toDTO(Student entity){
        StudentDTO dto = StudentDTO.builder().name(entity.getLastName()+" "+entity.getFirstName()).age(entity.getAge()).address(entity.getAddress()).userName(entity.getUserName()).build();
        return dto;
    }
    public List<StudentDTO> toDTO(List<Student> entities){
        List<StudentDTO> dtos = new ArrayList<>();
        entities.forEach(student -> {
            StudentDTO dto = toDTO(student);
            dtos.add(dto);
        });
        return dtos;
    }
}
