package com.ust.practice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.practice.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
