package ma.achraf.hopital.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;
@Entity
@Data   @NoArgsConstructor @AllArgsConstructor // Data ajouter les getters and sett
public class RendezVous {
    @Id
    private String id;
    private Date date;
    @Enumerated (EnumType.STRING)
    private  StatusRDV  Status;
    @ManyToOne
@JsonProperty (access = JsonProperty.Access.WRITE_ONLY)
    private  Patient patient; // rendez vous concerne un patient
    @ManyToOne
    private   Medecin medecin ; // rendez vous concern  Medcein
    @OneToOne  (mappedBy = "rendezVous")
    private Consultation consultation ;// rendezVous Conceern Consultation
}
