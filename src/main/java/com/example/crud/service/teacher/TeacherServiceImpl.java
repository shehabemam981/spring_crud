package com.example.crud.service.teacher;

import com.example.crud.dto.TeacherDto;
import com.example.crud.mapper.StudentMapper;
import com.example.crud.model.Teacher;
import com.example.crud.reposatory.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
  private TeacherRepo teacherRepo;
    @Override
    public List<TeacherDto> getAllTeachers() throws Exception {
   List<Teacher> teachers= teacherRepo.findAll();
   List<TeacherDto> teacherDtos= StudentMapper.studentMapper.convertToTeacherDto(teachers);
   return  teacherDtos;
    }

    @Override
    public List<TeacherDto> getAllTeacherByIds(List<Long> ids) throws Exception {
        List<Teacher> teachers = teacherRepo.findAllById(ids);
       return StudentMapper.studentMapper.convertToTeacherDto(teachers);
    }
}
