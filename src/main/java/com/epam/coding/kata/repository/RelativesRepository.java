package com.epam.coding.kata.repository;

import com.epam.coding.kata.model.Relatives;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelativesRepository extends JpaRepository<Relatives,Integer>{

}
