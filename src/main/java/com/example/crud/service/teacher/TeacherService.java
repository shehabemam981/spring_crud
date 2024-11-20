package com.example.crud.service.teacher;

import com.example.crud.dto.TeacherDto;
import java.util.List;


public interface TeacherService {
    List<TeacherDto> getAllTeachers()throws Exception;
    List<TeacherDto> getAllTeacherByIds(    List<Long> ids)throws Exception;
}
