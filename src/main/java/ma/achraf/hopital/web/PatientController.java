package ma.achraf.hopital.web;

import ma.achraf.hopital.Repositories.PatientRepository;
import ma.achraf.hopital.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // je viens de cree un controlleur qui permet de consulter La Liste des patient


public class PatientController {

    @Autowired // injct avec autowired

    private PatientRepository patientRepository;

    @GetMapping ("/patients") // ona le probleme des associations bidirectionnelle
     public List<Patient> patientList (){ // methode qui permet de consulter la liste de patient
         // pour accede cette methode en utilise la methode getMapping

         return patientRepository.findAll();
     }

}
