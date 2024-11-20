package com.example.crud.service;

import com.example.crud.dto.StudentDto;
import com.example.crud.mapper.StudentMapper;
import com.example.crud.model.Student;
import com.example.crud.reposatory.StudentRepo;
import jakarta.transaction.SystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceIml implements StudentService {
    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<StudentDto> getAllStudents() throws SystemException {
        try {
            List<Student> students = studentRepo.findAll();
            if(students.isEmpty()){
                throw new SystemException("error.noFoundStudents");
            }
            return StudentMapper.studentMapper.convertStudentToStudentDto(students);
        } catch (Exception e) {
            throw new SystemException(e.getMessage());
        }

    }

    @Override
    public List<StudentDto> getAllStudentsById(List<Long> id) throws SystemException {
        try{
            List<Student> students=studentRepo.findAllById(id);
       List<StudentDto> studentDtos=StudentMapper.studentMapper.convertStudentToStudentDto(students);
       return  studentDtos;
        }catch (Exception e){
            throw new SystemException("error.noFoundStudents");
        }
    }
}

