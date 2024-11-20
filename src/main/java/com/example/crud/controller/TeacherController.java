package com.example.crud.controller;

import com.example.crud.dto.TeacherDto;
import com.example.crud.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("allTeachers")
    public ResponseEntity<List<TeacherDto>> getAllTeachers() throws Exception {
        return ResponseEntity.ok(teacherService.getAllTeachers());
    }

    @GetMapping("allTeachersById")
    public ResponseEntity<List<TeacherDto>> getAllTeachesByIds(@RequestParam("ids")List<Long>ids)throws Exception{
        return ResponseEntity.ok(teacherService.getAllTeacherByIds(ids));
    }
}
