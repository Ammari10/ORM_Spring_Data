package ma.achraf.hopital;

import ma.achraf.hopital.Repositories.ConsultationRepository;
import ma.achraf.hopital.Repositories.MedecinRepository;
import ma.achraf.hopital.Repositories.PatientRepository;
import ma.achraf.hopital.Repositories.RendezVousRepository;
import ma.achraf.hopital.entities.*;
import ma.achraf.hopital.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication // la couche presentation >> la couche Metier >> la couche DAO
public class HopitalApplication   {

    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);
    }
     @Bean // tien au demarrage tu va executer cette methode il va te donner un objet et cette obj la tu va remplace dans contexte
    CommandLineRunner start (

            IHospitalService hospitalService, PatientRepository patientRepository,
            MedecinRepository medecinRepository,
            RendezVousRepository rendezVousRepository , // enregistre le rendez vous j ai besoin de injecte le
            ConsultationRepository  consultationRepository // injecte l interface pour enregistre la consltation

    ){


        //une methode qui va s executer au demarrage
        // cette methode la va retourne a l obj et cette obj devient un composant spring  comme cree une class avec la methode compenment

      return  args ->  {
          Stream.of("shrayyfa", "Yassine", "Mohamed") // pour chercher le patient par son nom
                  .forEach(name->{
                      Patient patient=new Patient();
                      patient.setNom(name);
                      patient.setDateNaissance(new Date());
                      patient.setMalade(false);
                 patientRepository.save(patient);
                  });
          Stream.of("oussama","Mustapha","ashraf")
                  .forEach(name->{
                      Medecin medecin=new Medecin();
                      medecin.setNom(name);
                      medecin.setEmail(name+"@gmail.com");
                      medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentitste");
                      medecinRepository.save(medecin);
                  });

          Patient patient = patientRepository. findById(1L).orElse(null); // je veux chercher un patient s il existe il va le retourne sinon il va retourne null
          Patient patient1 = patientRepository. findByNom("shrayyfa");

          Medecin medecin = medecinRepository.findByNom("ashraf");

          RendezVous rendezVous = new RendezVous(); // suis encrire un RDV qui concerne  un patient qui existe deja et un medecin qui  existe deja
          rendezVous.setDate(new Date());
          rendezVous.setStatus(StatusRDV.PENDING);
          rendezVous.setPatient(patient);
          rendezVous.setMedecin(medecin);
          RendezVous saveDRDV= hospitalService.saveRendezVous(rendezVous);
          System.out.println(saveDRDV.getId()); // Id de rendezVous getId attribute auto incremente used in database par exmpl quand  vous creer un rdv de qlq voila votre rdv
          // la methode Save  il retourne toujour l obj qui enregistre


          RendezVous rendezVous1= rendezVousRepository.findAll().get(0); // consulte tout les rdv  est j ai selectionne le premier RDV
          Consultation consultation = new Consultation(); // Consultation concerne un RDV
          consultation.setDateConsultation(new Date());
          consultation.setRendezVous(rendezVous1); // j ai fait la consultation pour le rendez vous 1
          consultation.setRapport(" Rapport de consultation..... "); // apres consultation je met un rapport
          hospitalService.saveConsultation(consultation);

      };
    }
}
