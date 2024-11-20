package com.example.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
private Long id;
private String name;
private List<TeacherDto> teacherDto;
}
