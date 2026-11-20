package tn.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.autoloc.domain.classes.Equipment;
import tn.autoloc.interfaces.IEQUIPMENT;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Equipment")

public class EquipmentRestController {
    IEQUIPMENT EquipmentService;

    // http://localhost:8089/gestionEquipments/Equipment/retrieve-all-Equipments
    @GetMapping("/retrieve-all-Equipments")
    public List<Equipment> getEquipments() {
        List<Equipment> listEquipments = EquipmentService.getAllEquipment();
        return listEquipments;
    }

    // http://localhost:8089/gestionEquipments/Equipment/retrieve-Equipment/8
    @GetMapping("/retrieve-Equipment/{Equipment-id}")
    public Equipment retrieveEquipment(@PathVariable("Equipment-id") Long EquipmentId) {
        Equipment Equipment =
                EquipmentService.getEquipmentById(EquipmentId);
        return Equipment;
    }

    // http://localhost:8089/gestionEquipments/Equipment/add-Equipment
    @PostMapping("/add-Equipment")
    public Equipment addEquipment(@RequestBody Equipment c) {
        Equipment Equipment = EquipmentService.addEquipment(c);
        return
                Equipment;
    }

    // http://localhost:8089/gestionEquipments/Equipment/remove-Equipment/{Equipment-id}
    @DeleteMapping("/remove-Equipment/{Equipment-id}")
    public void removeEquipment(@PathVariable("Equipment-id") Long EquipmentId) {
        EquipmentService.deleteEquipmentById(EquipmentId);
    }

    // http://localhost:8089/gestionEquipments/Equipment/modify-Equipment
    @PutMapping("/modify-Equipment")
    public Equipment modifyEquipment(@RequestBody Equipment c) {
        Equipment Equipment = EquipmentService.modifyEquipment(c);
        return Equipment;
    }
}