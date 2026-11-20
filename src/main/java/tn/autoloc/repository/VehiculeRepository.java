package tn.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.autoloc.domain.classes.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {
}
