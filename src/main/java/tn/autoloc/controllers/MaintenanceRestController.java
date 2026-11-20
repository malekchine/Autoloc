package tn.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.autoloc.domain.classes.Maintenance;
import tn.autoloc.interfaces.IMAINTENANCE;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Maintenance")

public class MaintenanceRestController {
    IMAINTENANCE MaintenanceService;

    // http://localhost:8089/gestionMaintenances/Maintenance/retrieve-all-Maintenances
    @GetMapping("/retrieve-all-Maintenances")
    public List<Maintenance> getMaintenances() {
        List<Maintenance> listMaintenances = MaintenanceService.getAllMaintenance();
        return listMaintenances;
    }

    // http://localhost:8089/gestionMaintenances/Maintenance/retrieve-Maintenance/8
    @GetMapping("/retrieve-Maintenance/{Maintenance-id}")
    public Maintenance retrieveMaintenance(@PathVariable("Maintenance-id") Long MaintenanceId) {
        Maintenance Maintenance =
                MaintenanceService.getMaintenanceById(MaintenanceId);
        return Maintenance;
    }

    // http://localhost:8089/gestionMaintenances/Maintenance/add-Maintenance
    @PostMapping("/add-Maintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance c) {
        Maintenance Maintenance = MaintenanceService.addMaintenance(c);
        return
                Maintenance;
    }

    // http://localhost:8089/gestionMaintenances/Maintenance/remove-Maintenance/{Maintenance-id}
    @DeleteMapping("/remove-Maintenance/{Maintenance-id}")
    public void removeMaintenance(@PathVariable("Maintenance-id") Long MaintenanceId) {
        MaintenanceService.deleteMaintenanceById(MaintenanceId);
    }

    // http://localhost:8089/gestionMaintenances/Maintenance/modify-Maintenance
    @PutMapping("/modify-Maintenance")
    public Maintenance modifyMaintenance(@RequestBody Maintenance c) {
        Maintenance Maintenance = MaintenanceService.modifyMaintenance(c);
        return Maintenance;
    }
}