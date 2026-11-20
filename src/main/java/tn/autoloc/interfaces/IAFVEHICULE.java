package tn.autoloc.interfaces;

import tn.autoloc.domain.classes.Vehicule;

public interface IAFVEHICULE {
    public Vehicule affecterVehicule(Long idVehicule, Long idAgence);
    public Vehicule affecterEquipement(Long idVehicule, Long idEquipement);
    public Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement);
}
