package ma.achraf.hopital.Repositories;

import ma.achraf.hopital.entities.Consultation;
import ma.achraf.hopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository <Consultation,Long>  { // spring Data
}
