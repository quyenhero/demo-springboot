package vn.com.devmaster.services.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.devmaster.services.demo.domain.Student;
import vn.com.devmaster.services.demo.respository.DemoRepository;
import vn.com.devmaster.services.demo.service.dto.StudentDTO;
import vn.com.devmaster.services.demo.service.mapper.StudentMapper;

import java.util.List;

@Service
public class DemoService {
    @Autowired
    private DemoRepository demoRepository;
    @Autowired
    private StudentMapper studentMapper;
    public List<StudentDTO> getALLStudent(){
        List<Student> list = demoRepository.getAll();
        return studentMapper.toDTO(list);
    }
    public StudentDTO getOne(String userName){
        return studentMapper.toDTO(demoRepository.getOne(userName));
    }
    public List<StudentDTO> getStudentByName(String name){
        return studentMapper.toDTO(demoRepository.getStudentByName(name));
    }
    public StudentDTO getStudentByUsernamePassword(String username,String password){
        return studentMapper.toDTO(demoRepository.getStudentByUsernamePassword(username,password));
    }
}
