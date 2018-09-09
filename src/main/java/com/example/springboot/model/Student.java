package com.example.springboot.model;

import javax.persistence.*;

@Entity
@Table(name = "studentInfo")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentInfo;
    @Column(name = "std_name")
    private String name;
    @Column(name = "std_roll")
    private String roll;
    @Column(name = "password")
    private String password;

    public Integer getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(Integer studentInfo) {
        this.studentInfo = studentInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
}
