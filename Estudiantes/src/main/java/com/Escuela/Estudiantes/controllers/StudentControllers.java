package com.Escuela.Estudiantes.controllers;

import com.Escuela.Estudiantes.entity.Student;
import com.Escuela.Estudiantes.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/listaestudiantes")
public class StudentControllers {
    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> listarStudnet(){
        return studentService.fileAll();
    }
    @GetMapping(value = "/{id}")
    public Optional<Student> findById(@RequestParam Long id){
        return studentService.findById(id);
    }
    @GetMapping(value = "/{name}")
    public List<Student> findByName(@RequestParam String nameStudent){
        return studentService.findByNameStudent(nameStudent);
    }
    @PostMapping()
    public void crearEstudiante(@Validated @RequestBody Student student){
        studentService.crearStudent(student);
    }
    @PutMapping(value = "/{id}")
    public void modificarEstudiante(@PathVariable Long id, @RequestBody Student student){
        studentService.modifyStudent(id, student);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteEstudiante(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
