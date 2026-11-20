package tn.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.autoloc.domain.classes.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
