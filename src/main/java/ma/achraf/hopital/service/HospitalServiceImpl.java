package ma.achraf.hopital.service;

import jakarta.transaction.Transactional;
import ma.achraf.hopital.Repositories.ConsultationRepository;
import ma.achraf.hopital.Repositories.MedcinRepository;
import ma.achraf.hopital.Repositories.PatientRepository;
import ma.achraf.hopital.Repositories.RendezVousRepository;
import ma.achraf.hopital.entities.Consultation;
import ma.achraf.hopital.entities.Medecin;
import ma.achraf.hopital.entities.Patient;
import ma.achraf.hopital.entities.RendezVous;
import org.springframework.stereotype.Service;

import java.util.UUID;

//lA COUCHE METIER
@Service // les obj de la couche metier generalment utilise la notation service
@Transactional // toutes les methode soit generalment transactionnelle
public class HospitalServiceImpl implements IHospitalService { // une class qui  implement l interface
    private PatientRepository patientRepository ;
    private  MedcinRepository medcinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedcinRepository medcinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medcinRepository = medcinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    // tous ca en haut c est l injection des DPNDC

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medcinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString()); // (Universally Unique Identifiers ) genere une chaine de caracter aleatoire mais il est unique qu ils dependet la datte de systm genere a manier Aleatoire
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
