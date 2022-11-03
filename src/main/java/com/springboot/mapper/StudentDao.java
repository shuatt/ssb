package com.springboot.mapper;

import com.springboot.vo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentDao {
    Student selectById(@Param("stuId") Integer id);
}
