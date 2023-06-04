package com.Escuela.Estudiantes.service;

import com.Escuela.Estudiantes.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public List<Student> fileAll();
    public Optional<Student> findById(Long id);
    public List<Student> findByNameStudent(String name);
    public void crearStudent(Student student);
    public void modifyStudent(Long id, Student student);
    public void deleteStudent(Long id);

}
