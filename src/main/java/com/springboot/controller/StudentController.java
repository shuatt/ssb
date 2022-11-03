package com.springboot.controller;

import com.springboot.service.StudentService;
import com.springboot.vo.Student;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping(value = "/myStudent")
    public Student queryStudent(Integer id){
       Student s = studentService.queryStudent(id);
       return s;
    }
}
