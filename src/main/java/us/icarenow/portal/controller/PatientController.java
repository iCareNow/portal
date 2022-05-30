package us.icarenow.portal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import us.icarenow.portal.model.Patient;
import us.icarenow.portal.service.PatientService;

import java.util.List;
import java.util.Optional;

@RestController
public class PatientController {
    public PatientService patientService = new PatientService();

    @GetMapping("getAllPatients")
    public List<Patient> findAll(){
        return patientService.findAll();
    }
    @GetMapping("getOnePatient")
    public Patient getOnePatient(@PathVariable int id){
        Optional<Patient> optional = patientService.findById(id);
        if (optional.isPresent()){
            return optional.get();
        } else {
            return null;
        }
    }
}
