package com.example.crud.mapper;

import com.example.crud.dto.StudentDto;
import com.example.crud.dto.TeacherDto;
import com.example.crud.model.Student;
import com.example.crud.model.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;
@Mapper
public interface StudentMapper {
    StudentMapper studentMapper = Mappers.getMapper(StudentMapper.class);
    List<StudentDto> convertStudentToStudentDto(List<Student> student);
    List<TeacherDto> convertToTeacherDto(List<Teacher> teachers);
}
