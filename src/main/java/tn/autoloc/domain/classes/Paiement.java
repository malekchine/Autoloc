package tn.autoloc.domain.classes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.autoloc.domain.enums.CategoryVehicule;
import tn.autoloc.domain.enums.ModePaiement;
import tn.autoloc.domain.enums.StatueVehicule;
import tn.autoloc.domain.enums.StatutResevation;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "paiement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiement;
    @Column(nullable = false,precision=10,scale=2)
    private BigDecimal montant;
    @Column(nullable = false)
    private LocalDate datePaiement;
    @Column(nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private ModePaiement modePaiement;
    @ManyToOne(fetch = FetchType.LAZY)
    private Contract contract;
}
