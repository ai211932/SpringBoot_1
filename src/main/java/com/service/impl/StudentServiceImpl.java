package com.service.impl;

import com.entity.Student;
import com.repository.StudentRepository;
import com.service.StudentService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * author Jimmy
 * date   2018/7/11 16:23
 */
@Repository
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentRepository studentDao;


    @Override
    public Integer add(Student student) {
        return studentDao.save(student).getId();
    }

    @Override
    public void delete(Integer id) {
        studentDao.delete(id);
    }

    @Override
    public void delete(Student student) {
        studentDao.delete(student);
    }

    @Override
    public void update(Student student) {
        studentDao.save(student);
    }

    @Override
    public Student findOne(Integer id) {
        return studentDao.getOne(id);
    }

    @Override
    public List<Student> listAll() {
        return studentDao.findAll();
    }
}
