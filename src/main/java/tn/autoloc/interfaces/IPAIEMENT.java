package tn.autoloc.interfaces;

import tn.autoloc.domain.classes.Paiement;

import java.util.List;

public interface IPAIEMENT  {
    public Paiement addPaiement(Paiement Paiement);
    public Paiement getPaiementById(long id);
    public List<Paiement> getAllPaiement();
    public void deletePaiementById(long id);
    public Paiement modifyPaiement(Paiement paiement);
}