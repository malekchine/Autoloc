package tn.autoloc.interfaces;

import tn.autoloc.domain.classes.Reservation;

import java.util.List;

public interface IRESERVATION  {
    public Reservation addReservation(Reservation Reservation);
    public Reservation getReservationById(long id);
    public List<Reservation> getAllReservation();
    public void deleteReservationById(long id);
    public Reservation modifyReservation(Reservation reservation);
}
