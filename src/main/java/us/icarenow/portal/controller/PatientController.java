package us.icarenow.portal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import us.icarenow.portal.model.Patient;
import us.icarenow.portal.service.PatientService;

import java.util.List;
import java.util.Optional;

@RestController
public class PatientController {
    public PatientService patientService = new PatientService();

    @GetMapping("patients")
    public List<Patient> findAll(){
        return patientService.findAll();
    }
    @GetMapping("patients/{id}")
    public Patient getOnePatient(@PathVariable int id){
        Optional<Patient> optional = patientService.findById(id);
        if (optional.isPresent()){
//            Link link = linkTo(methodOn(PatientController.class).getOnePatient(id)).withSelfRel();
            return optional.get();
        } else {
            return null;
        }
    }
    @DeleteMapping("patients/{id}")
    public ResponseEntity<?> delete (@PathVariable int id ){
        boolean deleted = patientService.delete(id);
        if (deleted) {
            return new ResponseEntity<>("Deleted succesfuly", HttpStatus.OK);

        } else  {
            return new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND );
        }

    }
    @PostMapping("addPatient")
    public String addPatient(@RequestBody Patient patient) {
        return patientService.addPatient(patient);
    }
}
