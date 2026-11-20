package tn.autoloc.controllers;

import io.micrometer.core.instrument.distribution.FixedBoundaryVictoriaMetricsHistogram;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.autoloc.domain.classes.Vehicule;
import tn.autoloc.interfaces.IAFVEHICULE;
import tn.autoloc.interfaces.IVEHICULE;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Vehicule")

public class VehiculeRestController {
    IVEHICULE VehiculeService;
    IAFVEHICULE AffecService;

    // http://localhost:8089/gestionVehicules/Vehicule/retrieve-all-Vehicules
    @GetMapping("/retrieve-all-Vehicules")
    public List<Vehicule> getVehicules() {
        List<Vehicule> listVehicules = VehiculeService.getAllVehicule();
        return listVehicules;
    }

    // http://localhost:8089/gestionVehicules/Vehicule/retrieve-Vehicule/8
    @GetMapping("/retrieve-Vehicule/{Vehicule-id}")
    public Vehicule retrieveVehicule(@PathVariable("Vehicule-id") Long VehiculeId) {
        Vehicule Vehicule =
                VehiculeService.getVehiculeById(VehiculeId);
        return Vehicule;
    }

    // http://localhost:8089/gestionVehicules/Vehicule/add-Vehicule
    @PostMapping("/add-Vehicule")
    public Vehicule addVehicule(@RequestBody Vehicule c) {
        Vehicule Vehicule = VehiculeService.addVehicule(c);
        return
                Vehicule;
    }

    // http://localhost:8089/gestionVehicules/Vehicule/remove-Vehicule/{Vehicule-id}
    @DeleteMapping("/remove-Vehicule/{Vehicule-id}")
    public void removeVehicule(@PathVariable("Vehicule-id") Long VehiculeId) {
        VehiculeService.deleteVehiculeById(VehiculeId);
    }

    // http://localhost:8089/gestionVehicules/Vehicule/modify-Vehicule
    @PutMapping("/modify-Vehicule")
    public Vehicule modifyVehicule(@RequestBody Vehicule c) {
        Vehicule Vehicule = VehiculeService.modifyVehicule(c);
        return Vehicule;
    }
    //IAFVEHICULE AffecService;

    @PutMapping("/assignEquipTo/{idVehicule}/{idEquipment}")
    public Vehicule affecterEquipAuVehicule(@PathVariable Long idVehicule,@PathVariable Long idEquipment) {
        return AffecService.affecterEquipement(idVehicule,idEquipment);
    }

    @PutMapping("/RemoveEquipFrom/{idVehicule}/{idEquipment}")
    public Vehicule desffecterEquipDuVehicule(@PathVariable Long idVehicule,@PathVariable Long idEquipment) {
        return AffecService.desaffecterEquipement(idVehicule,idEquipment);
    }
    @PutMapping("/affectVehiculeToAgence/{idAgence}/{idVehicle}")
    public Vehicule affectVehiToAgence(@PathVariable Long idAgence,@PathVariable Long idVehicle) {
        return AffecService.affecterVehicule(idAgence,idVehicle);
    }
}