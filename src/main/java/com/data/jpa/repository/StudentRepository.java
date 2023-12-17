package com.data.jpa.repository;

import com.data.jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    // implementing custom queries


    @Query("SELECT s FROM Student s WHERE s.email = ?1") //this is JPQL
    Optional<Student> findStudentByEmail(String email);

    @Query("SELECT s FROM Student s WHERE s.firstName = ?1 AND s.age = ?2")
    List<Student> findStudentByFirstNameEqualsAndAgeEquals(String firstName, Integer age);

    @Query("SELECT s FROM Student s WHERE s.lastName = ?1")
    Optional<Student> findStudentByLastName(String lastName);


}
