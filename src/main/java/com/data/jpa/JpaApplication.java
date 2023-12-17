package com.data.jpa;

import com.data.jpa.model.Student;
import com.data.jpa.model.StudentID;
import com.data.jpa.repository.StudentIdCardRepository;
import com.data.jpa.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository, StudentIdCardRepository studentIdCardRepository){
		return args -> {
//			Student maira = new Student(
//					1L,
//					"Maria",
//					"Jones",
//					"maira@jones.com",
//					12
//			);
//			Student emma = new Student(
//					2L,
//					"Emma",
//					"Wu",
//					"emma@wu.com",
//					18
//			);
//			studentRepository.saveAll(List.of(maira,emma));
//			studentRepository.findById(2L).ifPresentOrElse(
//					System.out::println,
//					()->{}
//			);

//			StudentID cardNum = new StudentID(
//					1L,
//					"ABCD1234",
//					emma
//			);
//
//
//			studentIdCardRepository.save(cardNum);
//			studentIdCardRepository.findById(1L)
//					.ifPresentOrElse(
//							System.out::println,
//							()-> System.out.println("No id found")
//					);


		};



}}
