package com.example.springexample.springboot.web.rest;

import com.example.springexample.springboot.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentResource {

    @GetMapping("/students/all")
    public ResponseEntity hello() {
        Student student = new Student(1L, "Aziz", "Azizov", "3-kurs");
        Student student1 = new Student(2L, "Zafar", "Zafarov", "3-kurs");
        Student student2 = new Student(3L, "Hasanboy", "Hasanov", "4-kurs");
        List<Student> studentList = Arrays.asList(student, student2, student1);
        return ResponseEntity.ok(studentList);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity getOne(@PathVariable Long id) {
        Student student = new Student(id, "Aziz", "Azizov", "3-kurz");
        return ResponseEntity.ok(student);
    }
    @GetMapping("/students")
    public ResponseEntity getOne(@RequestParam Long id,
                                 @RequestParam String name,
                                 @RequestParam String lastName,
                                 @RequestParam String course) {
        Student student = new Student(id, name, lastName, course);
        return ResponseEntity.ok(student);
    }
   /* @RequestMapping(value = "/students", method = RequestMethod.GET)
    public String hello() {
        return "Hello ";
    }*/

}
