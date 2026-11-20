package tn.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.autoloc.domain.classes.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment,Long> {
}
