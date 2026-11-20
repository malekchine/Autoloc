package tn.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.autoloc.domain.classes.Reservation;
import tn.autoloc.interfaces.IRESERVATION;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Reservation")

public class ReservationRestController {
    IRESERVATION ReservationService;

    // http://localhost:8089/gestionReservations/Reservation/retrieve-all-Reservations
    @GetMapping("/retrieve-all-Reservations")
    public List<Reservation> getReservations() {
        List<Reservation> listReservations = ReservationService.getAllReservation();
        return listReservations;
    }

    // http://localhost:8089/gestionReservations/Reservation/retrieve-Reservation/8
    @GetMapping("/retrieve-Reservation/{Reservation-id}")
    public Reservation retrieveReservation(@PathVariable("Reservation-id") Long ReservationId) {
        Reservation Reservation =
                ReservationService.getReservationById(ReservationId);
        return Reservation;
    }

    // http://localhost:8089/gestionReservations/Reservation/add-Reservation
    @PostMapping("/add-Reservation")
    public Reservation addReservation(@RequestBody Reservation c) {
        Reservation Reservation = ReservationService.addReservation(c);
        return
                Reservation;
    }

    // http://localhost:8089/gestionReservations/Reservation/remove-Reservation/{Reservation-id}
    @DeleteMapping("/remove-Reservation/{Reservation-id}")
    public void removeReservation(@PathVariable("Reservation-id") Long ReservationId) {
        ReservationService.deleteReservationById(ReservationId);
    }

    // http://localhost:8089/gestionReservations/Reservation/modify-Reservation
    @PutMapping("/modify-Reservation")
    public Reservation modifyReservation(@RequestBody Reservation c) {
        Reservation Reservation = ReservationService.modifyReservation(c);
        return Reservation;
    }
}