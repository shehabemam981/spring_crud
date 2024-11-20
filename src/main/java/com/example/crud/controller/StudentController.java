package com.example.crud.controller;

import com.example.crud.dto.StudentDto;
import com.example.crud.service.StudentService;
import jakarta.transaction.SystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/getAllStudents")
    public ResponseEntity<List<StudentDto>> getAllStudentC() throws SystemException {
       List<StudentDto> studentDtos= studentService.getAllStudents();
    return  ResponseEntity.ok(studentDtos);
    }

    @GetMapping("/getAllStudentById")
    public ResponseEntity<List<StudentDto>> getAllStudentsById(@RequestParam("id") List<Long> ids)throws Exception{
        List<StudentDto> studentDtos=studentService.getAllStudentsById(ids);
        return ResponseEntity.ok(studentDtos);
    }
}
