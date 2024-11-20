package com.example.crud.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Teacher> teacher;


}
