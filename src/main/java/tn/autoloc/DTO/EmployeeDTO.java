package tn.autoloc.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private String nom;
    private String prenom;
    private String role;
    private String nomAgence; // 'agence.nom' de l'entité Agence associée
}
