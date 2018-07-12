package com.controller;

import com.entity.Student;
import com.service.StudentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * author Jimmy
 * date   2018/7/11 11:07
 */
@RestController
public class HelloWorldController {

    @Resource
    private StudentService studentService;
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/add")
    public String getStudent(){
        Student student = new Student();
        student.setName("张三 "+System.currentTimeMillis());
        student.setCreateDate(new Date());
        studentService.add(student);
        return "<script>alert( 'add success')</script>";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id")Integer id){
        try {
            studentService.delete(id);
        }catch (Exception e){
            System.out.println("删除失败！可能是应该删除的实体id不存在。");
            return "<script>alert( 'delete failed')</script>";
        }
        return "<script>alert( 'delete success')</script>";
    }

    @RequestMapping("/list")
    public List<Student> findAll(){
        return studentService.listAll();
    }
}
