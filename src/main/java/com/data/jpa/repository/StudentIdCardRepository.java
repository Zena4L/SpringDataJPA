package com.data.jpa.repository;

import com.data.jpa.model.StudentID;
import org.springframework.data.repository.CrudRepository;

public interface StudentIdCardRepository extends CrudRepository<StudentID,Long> {

}
