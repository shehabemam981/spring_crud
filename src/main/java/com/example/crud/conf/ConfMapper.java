package com.example.crud.conf;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfMapper {

    @Bean
    public ModelMapper modelMapper(){
    return new ModelMapper();
    }


}
