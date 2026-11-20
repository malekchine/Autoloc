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
import java.time.LocalDate;

@Entity
@Table(name = "maintenance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;
    @Column(nullable = false)
    private LocalDate dateDebut;
    @Column(nullable = false)
    private LocalDate dateFin;
    @Column(nullable = false, length = 255)
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    private Vehicule vehicule;
}
