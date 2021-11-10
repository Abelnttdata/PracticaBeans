package com.example.springcoredojo.NTT;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

    //Clase para la creacion de los Beans
    @Configuration
    @ComponentScan(basePackageClasses = Usuario.class)
    public class Config{
        @Bean
        public Alumno getAlumno(){
            return new Alumno("Abel","Martinez",23);
        }

    }

