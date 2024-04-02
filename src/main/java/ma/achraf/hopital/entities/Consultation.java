package ma.achraf.hopital.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
// une consultation pour un rendezVous
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Consultation {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  Long id;
    private Date dateConsultation;
    private  String rapport;
    @OneToOne
    @JsonProperty (access = JsonProperty.Access.WRITE_ONLY) //
    private RendezVous rendezVous ; // Maintenant va faire de maping va utilise les annotation GPA
}
