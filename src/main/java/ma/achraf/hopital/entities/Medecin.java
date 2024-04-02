package ma.achraf.hopital.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Medecin {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String nom;
    private String email;
    private String specialite;
    @OneToMany (mappedBy = "medecin", fetch=FetchType.LAZY)

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY ) // c est pas la peine de me donner la liste des rendezVous parce que sinon on va tomber dans la meme boucle infinie
    private Collection<RendezVous> rendezVous;
}
