package ma.achraf.hopital.Repositories;

import ma.achraf.hopital.entities.Medecin;
import ma.achraf.hopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedcinRepository extends JpaRepository <Medecin,Long>  { // spring Data
    Medecin findByNom(String name);
}
