package tn.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.autoloc.domain.classes.Agence;
import tn.autoloc.domain.classes.Equipment;
import tn.autoloc.domain.classes.Vehicule;
import tn.autoloc.interfaces.IAFVEHICULE;
import tn.autoloc.interfaces.IVEHICULE;
import tn.autoloc.repository.AgenceRepository;
import tn.autoloc.repository.EquipmentRepository;
import tn.autoloc.repository.VehiculeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeService implements IVEHICULE, IAFVEHICULE {
    private final VehiculeRepository vr;
    private final AgenceRepository agenceRepo;
    private final EquipmentRepository equipmentRepo;

    @Override
    public Vehicule addVehicule(Vehicule Vehicule) {
        return vr.save(Vehicule);
    }

    @Override
    public Vehicule getVehiculeById(long id) {
        return vr.findById(id).get();
    }

    @Override
    public List<Vehicule> getAllVehicule() {
        return vr.findAll();
    }

    @Override
    public void deleteVehiculeById(long id) {
        vr.deleteById(id);
    }

    @Override
    public Vehicule modifyVehicule(Vehicule vehicule) {
        return vr.save(vehicule);
    }

    @Override
    public Vehicule affecterVehicule(Long idVehicule, Long idAgence) {
        Vehicule vehicule = vr.findById(idVehicule).orElseThrow(() -> new RuntimeException("Vehicule not found"));
        Agence Agence = agenceRepo.findById(idAgence).orElseThrow(() -> new RuntimeException("Agence not found"));

        vehicule.setAgence(Agence);
        return vr.save(vehicule);
    }

    @Override
    public Vehicule affecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = vr.findById(idVehicule).orElseThrow(() -> new RuntimeException("Vehicule not found"));
       // tn.autoloc.domain.classes.Equipment = agenceRepo.findById(idEquipement).orElseThrow(() -> new RuntimeException("Agence not found"));
        Equipment equip = equipmentRepo.findById(idEquipement).orElseThrow(() -> new RuntimeException("Equipment not found"));

        vehicule.getEquipments().add(equip);
        return vr.save(vehicule);
    }

    @Override
    public Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = vr.findById(idVehicule).orElseThrow(() -> new RuntimeException("Vehicule not found"));
        // tn.autoloc.domain.classes.Equipment = agenceRepo.findById(idEquipement).orElseThrow(() -> new RuntimeException("Agence not found"));
        Equipment equip = equipmentRepo.findById(idEquipement).orElseThrow(() -> new RuntimeException("Equipment not found"));

        vehicule.getEquipments().add(equip);
        return vr.save(vehicule);
    }
}
