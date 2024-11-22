package com.medicine;
/**
 * 
 * @author Puput Debbyla Walzahra
 */
import com.medicine.controller.medicineController;
import com.medicine.service.medicineService;
import com.medicine.view.medicineView;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class medicineApp implements ApplicationRunner {
    @Autowired
    private medicineService medicineService;
    
    public static void main(String[] args){
        System.setProperty("java.awt.headless", "false");
        ApplicationContext context = SpringApplication.run(medicineApp.class, args);
        medicineController controller = context.getBean(medicineController.class);
        medicineView medicineView = new medicineView(controller);
        medicineView.setVisible(true);
        
    }
    @Override       
    public void run(ApplicationArguments args) throws Exception {
       
    }
}

