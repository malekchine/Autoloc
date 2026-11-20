
package tn.autoloc.domain.classes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.autoloc.domain.enums.CategoryVehicule;
import tn.autoloc.domain.enums.StatueVehicule;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vehicule")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;
    @Column(nullable = false, unique = true, length = 20)
    private String immatriculation;
    @Column(nullable = false, length = 50)
    private String marque;
    @Column(nullable = false, length = 50)
    private String modele;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private CategoryVehicule categorie;
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal tarifJournalier;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private StatueVehicule statut;
    @ManyToOne(fetch = FetchType.LAZY)
    private Agence agence;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "vehicule_equipement")
    private Set<Equipment> equipments = new HashSet<>();

    public Long getIdVehicule() {
        return idVehicule;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public CategoryVehicule getCategorie() {
        return categorie;
    }

    public BigDecimal getTarifJournalier() {
        return tarifJournalier;
    }

    public StatueVehicule getStatut() {
        return statut;
    }

    public Agence getAgence() {
        return agence;
    }

    public Set<Equipment> getEquipments() {
        return equipments;
    }

    public void setIdVehicule(Long idVehicule) {
        this.idVehicule = idVehicule;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setCategorie(CategoryVehicule categorie) {
        this.categorie = categorie;
    }

    public void setTarifJournalier(BigDecimal tarifJournalier) {
        this.tarifJournalier = tarifJournalier;
    }

    public void setStatut(StatueVehicule statut) {
        this.statut = statut;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public void setEquipments(Set<Equipment> equipments) {
        this.equipments = equipments;
    }
}
