package ma.achraf.hopital.Repositories;

import ma.achraf.hopital.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository <Medecin,Long>  { // spring Data
    Medecin findByNom(String name);
}
