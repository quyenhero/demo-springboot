package vn.com.devmaster.services.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.com.devmaster.services.demo.domain.Student;
import vn.com.devmaster.services.demo.service.DemoService;
import vn.com.devmaster.services.demo.service.dto.StudentDTO;

import java.util.List;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping(method = RequestMethod.GET,value = "/students")
    List<StudentDTO> getStudent(){
        return demoService.getALLStudent();
    }
    @RequestMapping(method = RequestMethod.GET,value = "/student")
    StudentDTO getOne(@RequestParam("userName") String userName){
        return demoService.getOne(userName);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/search")
    List<StudentDTO> getStudentByName(@RequestParam("name") String name){
        return demoService.getStudentByName(name);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/getByUsPw")
    StudentDTO getStudentByUsernamePassword(@RequestParam("username") String username,@RequestParam("password") String password){
        return demoService.getStudentByUsernamePassword(username,password);
    }
}
