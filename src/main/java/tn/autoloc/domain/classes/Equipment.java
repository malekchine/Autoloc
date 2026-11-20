package tn.autoloc.domain.classes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "equipment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipment;
    @Column(nullable = false)
    private String libelle;
    @JsonIgnore
    @ManyToMany(mappedBy = "equipments", fetch = FetchType.LAZY)
    private Set<Vehicule> vehicules = new HashSet<>();

}

