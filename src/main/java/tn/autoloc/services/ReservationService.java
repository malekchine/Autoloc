package tn.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.autoloc.domain.classes.Reservation;
import tn.autoloc.interfaces.IRESERVATION;
import tn.autoloc.repository.ReservationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService implements IRESERVATION {
    private final ReservationRepository resrep;

    @Override
    public Reservation addReservation(Reservation Reservation) {
        return resrep.save(Reservation);
    }

    @Override
    public Reservation getReservationById(long id) {
        return resrep.findById(id).get();
    }

    @Override
    public List<Reservation> getAllReservation() {
        return resrep.findAll();
    }

    @Override
    public void deleteReservationById(long id) {
        resrep.deleteById(id);
    }

    @Override
    public Reservation modifyReservation(Reservation reservation) {
        return resrep.save(reservation);
    }
}
