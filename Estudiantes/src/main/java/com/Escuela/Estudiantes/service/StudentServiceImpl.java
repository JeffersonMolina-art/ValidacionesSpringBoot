package com.Escuela.Estudiantes.service;

import com.Escuela.Estudiantes.dao.StudentsDao;
import com.Escuela.Estudiantes.entity.Student;
import com.Escuela.Estudiantes.execption.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentsDao studentsDao;
    @Override
    public List<Student> fileAll() {
        return (List<Student>)studentsDao.findAll() ;
    }

    @Override
    public Optional<Student> findById(Long id) {
        Optional<Student> optionalStudent = studentsDao.findById(id);
        if(optionalStudent.isEmpty()){
            throw new NotFoundException("Estudiante no encontrado");
        }
        return optionalStudent;
    }

    @Override
    public List<Student> findByNameStudent(String nameStudent) {
        List<Student> studin = studentsDao.findByNameStudent(nameStudent);
        if(studin.isEmpty()){
            throw new NotFoundException("Estudiante no encontrado");
        }
        return studin;
    }

    @Override
    public void crearStudent(Student student) {
        studentsDao.save(student);
        if (student == null){
            throw new NotFoundException("No se puede crear estudiante");
        }
    }

    @Override
    public void modifyStudent(Long id, Student student) {
        if(studentsDao.existsById(id)){
            student.setId(id);
            studentsDao.save(student);
        }else{
            throw new NotFoundException("No se pudo modificar estudiante");
        }
    }

    @Override
    public void deleteStudent(Long id) {
        if(studentsDao.existsById(id)){
            studentsDao.deleteById(id);
        }else {
            throw new NotFoundException("No se pudo eliminar estuidante");
        }
    }
}
