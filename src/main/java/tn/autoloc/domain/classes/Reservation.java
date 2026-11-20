package tn.autoloc.domain.classes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.autoloc.domain.enums.CategoryVehicule;
import tn.autoloc.domain.enums.StatueVehicule;
import tn.autoloc.domain.enums.StatutResevation;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "reservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    @Column(nullable = false)
    private LocalDate dateDebut;
    @Column(nullable = false)
    private LocalDate dateFin;
    @Column(nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private StatutResevation statut;
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;
    @ManyToOne(fetch = FetchType.LAZY)
    private Vehicule vehicule;
    @JsonIgnore
    @OneToOne(mappedBy = "reservation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Contract contract;
}
