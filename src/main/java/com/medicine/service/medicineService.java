package com.medicine.service;
/**
 *
 * @author Muhammad Ridho
 */
import com.medicine.model.modelMedicine;
import com.medicine.repository.repositoryMedicine;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class medicineService {
    @Autowired
    private repositoryMedicine repository;
    
    public void addMdc(modelMedicine mdc){
        repository.save(mdc);
    } 
    public modelMedicine getMdc(int id){
        return repository.findById(id).orElse(null);
    }
    public void updateMdc(modelMedicine mdc){
        repository.save(mdc);
    }
    public void deleteMdc(int id){
        repository.deleteById(id);
    }
    public List<modelMedicine> getAllMedicine(){
        return repository.findAll();
    }
}
 
