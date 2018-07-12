package com.repository;

import com.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author Jimmy
 * date   2018/7/11 16:16
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
