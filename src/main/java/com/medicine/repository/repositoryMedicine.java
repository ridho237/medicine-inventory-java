package com.medicine.repository;
/**
 *
 * @author Muhammad Ridho
 */
import com.medicine.model.modelMedicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface repositoryMedicine extends JpaRepository<modelMedicine, Integer>{
    
}