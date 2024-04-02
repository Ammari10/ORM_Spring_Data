package ma.achraf.hopital.Repositories;

import ma.achraf.hopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository  extends JpaRepository <Patient,Long>  { // spring Data
    Patient findByNom(String name);// pour chercher le patient par son nom
}
