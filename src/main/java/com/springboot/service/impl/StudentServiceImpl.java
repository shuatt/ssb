package com.springboot.service.impl;

import com.springboot.mapper.StudentDao;
import com.springboot.vo.Student;
import com.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;
    @Override
    public Student queryStudent(Integer id) {
        Student s =studentDao.selectById(id);
        return s;
    }
}
