package com.Escuela.Estudiantes.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "estudiantes")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "el nombre estudiante no puede ser vacio")
    private String nameStudent;
    @NotBlank(message = "el email no puede ser vacio")
    private String email;
    @NotBlank(message = "el carnet no puede ser vacio")
    private String carnet;
    private Double average;
    @Column
    @Temporal(TemporalType.DATE)
    private Date createAT;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Date getCreateAT() {
        return createAT;
    }

    public void setCreateAT(Date createAT) {
        this.createAT = createAT;
    }
}
