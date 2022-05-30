package us.icarenow.portal.service;

import us.icarenow.portal.model.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PatientService {
    private List<Patient> patientList = new ArrayList<Patient>() {{
        add(new Patient(0,"Radu Baciu", true));
        add(new Patient(1,"Andrian Libenciuc",false));
        add(new Patient(2,"Alina Sastras", true));
        add(new Patient(3,"Flo",true));
        add(new Patient(4,"Andrei Mladin", false));


    }};
    public List<Patient> findAll(){
        return patientList;
    }

    public Optional<Patient> findById(int id){
        return patientList.stream().filter(patient -> patient.getId() == id).findFirst();

    }
    /**
     * Delete patient with this id
     */
    public boolean delete(int id){
        int index = -1;
        for (int i = 0; i < patientList.size(); i++){
            if (patientList.get(i).getId() == id) {
                index = i;
            }
        }
        if (index == -1){
            return false ;
        } else {
            patientList.remove(index);
            return true;
        }

    }
}
