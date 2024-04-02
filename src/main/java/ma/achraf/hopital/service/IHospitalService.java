package ma.achraf.hopital.service;

import ma.achraf.hopital.entities.Consultation;
import ma.achraf.hopital.entities.Medecin;
import ma.achraf.hopital.entities.Patient;
import ma.achraf.hopital.entities.RendezVous;



public interface IHospitalService {
  Patient savePatient (Patient patient) ;// vous avez besoin une methode qui permet ajt un patient
  Medecin saveMedecin (Medecin medcin) ;
  RendezVous saveRendezVous (RendezVous rendezVous);
  Consultation saveConsultation (Consultation consultation);
}
