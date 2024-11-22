package com.medicine.controller;
/**
 *
 * @author Muhammad Ridho
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.medicine.model.modelMedicine;
import com.medicine.service.medicineService;
import java.util.List;
import org.springframework.stereotype.Controller;

@Controller
public class medicineController {
@Autowired
    private medicineService medicineService;
    
    public String addMedicine(@RequestBody modelMedicine mdc){
        medicineService.addMdc(mdc);
        return "Obat Added Succesfully";
    }
    public modelMedicine getMedicine(@PathVariable int id){
        return medicineService.getMdc(id);
    }
    public String updateMedicine(@RequestBody modelMedicine mdc){
        medicineService.updateMdc(mdc);
        return "Obat Updated Successfully";
    }
    public String deleteMedicine(@PathVariable int id){
        medicineService.deleteMdc(id);
        return "Obat Deleted Successfully";
    }
    public List<modelMedicine> getAllMedicine(){
        return medicineService.getAllMedicine();
    }

    public void deleteMhs(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
