package tn.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.autoloc.domain.classes.Equipment;
import tn.autoloc.interfaces.IEQUIPMENT;
import tn.autoloc.repository.EquipmentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipmentService implements IEQUIPMENT {
    private final EquipmentRepository equipmentRepository;

    @Override
    public Equipment addEquipment(Equipment Equipment) {
        return equipmentRepository.save(Equipment);
    }

    @Override
    public Equipment getEquipmentById(long id) {
        return equipmentRepository.findById(id).get();
    }

    @Override
    public List<Equipment> getAllEquipment() {
        return equipmentRepository.findAll();
    }

    @Override
    public void deleteEquipmentById(long id) {
        equipmentRepository.deleteById(id);
    }

    @Override
    public Equipment modifyEquipment(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }
}
