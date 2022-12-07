package com.epam.coding.kata.repository;


import com.epam.coding.kata.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarksRepository extends JpaRepository<CourseModel, Long> {
	

}
