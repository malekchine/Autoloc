package tn.autoloc.domain.classes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "contract")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContract;
    @Column(nullable = false)
    private LocalDate dateSignature;
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal montantTotal;
    @Column(nullable = false)
    private Boolean valide;
    @JsonIgnore
    @OneToMany(mappedBy = "contract", cascade = CascadeType.ALL,
            orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Paiement> paiements = new ArrayList<>();
    @OneToOne(fetch = FetchType.LAZY)
    private Reservation reservation;
}