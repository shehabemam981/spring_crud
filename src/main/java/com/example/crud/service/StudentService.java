package com.example.crud.service;
import com.example.crud.dto.StudentDto;
import jakarta.transaction.SystemException;

import java.util.List;

public interface StudentService {
public List<StudentDto> getAllStudents() throws SystemException;
public  List<StudentDto> getAllStudentsById(List<Long>  id)throws  SystemException;
}
