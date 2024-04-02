package ma.achraf.hopital.Repositories;

import ma.achraf.hopital.entities.Patient;
import ma.achraf.hopital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository <RendezVous,String>  { // spring Data
}
