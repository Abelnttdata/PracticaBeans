package com.example.springcoredojo;

import com.example.springcoredojo.NTT.Alumno;
import com.example.springcoredojo.NTT.Config;
import com.example.springcoredojo.NTT.Usuario;
import com.example.springcoredojo.examplexmlpath.Youtuber;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreDojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDojoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			creacionBean();
			classPathXmlApplicationContext();
			sustituirConXmlAlumno();
		};
	}

	public void creacionBean(){
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Usuario usuarioGeneradoPorBean = context.getBean("usuario", Usuario.class);
		System.out.println("Usuario: " + usuarioGeneradoPorBean);
	}


	public void classPathXmlApplicationContext(){
		ApplicationContext context = new ClassPathXmlApplicationContext("youTuber-Bean-congig.xml");
		Youtuber youtuber = (Youtuber) context.getBean("youtuber");
		System.out.println("Youtuber: " + youtuber.getNombre());
	}

	public void sustituirConXmlAlumno(){
		ApplicationContext context = new ClassPathXmlApplicationContext("alumno-bean-config.xml");
		Alumno alumno = (Alumno) context.getBean("alumno");
		System.out.println("Alumno: " + alumno.getNombre());
		System.out.println("Apellido: " + alumno.getApellido());
		System.out.println("Edad: " + alumno.getEdad());
	}
}
