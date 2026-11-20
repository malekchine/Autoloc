package tn.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.autoloc.domain.classes.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement,Long> {
}
