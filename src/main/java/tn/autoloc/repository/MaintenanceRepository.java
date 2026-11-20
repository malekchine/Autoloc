package tn.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.autoloc.domain.classes.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance,Long> {
}
