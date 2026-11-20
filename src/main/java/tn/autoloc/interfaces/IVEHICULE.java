package tn.autoloc.interfaces;

import tn.autoloc.domain.classes.Vehicule;

import java.util.List;

public interface IVEHICULE {
    public Vehicule addVehicule(Vehicule Vehicule);
    public Vehicule getVehiculeById(long id);
    public List<Vehicule> getAllVehicule();
    public void deleteVehiculeById(long id);
    public Vehicule modifyVehicule(Vehicule vehicule);
}
