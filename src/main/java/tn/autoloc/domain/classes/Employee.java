package tn.autoloc.domain.classes;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.autoloc.domain.enums.RoleEmployee;



@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmployee;
    @Column(nullable = false, length = 50)
    private String nom;
    @Column(nullable = false, length = 50)
    private String prenom;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private RoleEmployee role;
    @ManyToOne(fetch = FetchType.LAZY)
    private Agence agence;

    public String getPrenom() {
        return prenom;
    }

    public Agence getAgence() {
        return agence;
    }

    public RoleEmployee getRole() {
        return role;
    }

    public String getNom() {
        return nom;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setRole(RoleEmployee role) {
        this.role = role;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }
}
