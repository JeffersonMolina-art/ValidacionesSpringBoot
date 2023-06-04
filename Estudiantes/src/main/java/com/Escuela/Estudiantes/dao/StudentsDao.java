package com.Escuela.Estudiantes.dao;

import com.Escuela.Estudiantes.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentsDao extends CrudRepository<Student, Long> {

    List<Student> findByNameStudent(String nameStudent);

}
