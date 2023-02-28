package com.example.springexample.springboot.model;

public class Student {
  private Long id;
  private String  name;
  private String lastName;
  private String course;
    public Student(Long id, String name, String lastName, String course) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCourse() {
        return course;
    }
}
