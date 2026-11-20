package tn.autoloc.interfaces;

import tn.autoloc.domain.classes.Equipment;

import java.util.List;

public interface IEQUIPMENT {
    public Equipment addEquipment(Equipment Equipment);
    public Equipment getEquipmentById(long id);
    public List<Equipment> getAllEquipment();
    public void deleteEquipmentById(long id);
    public Equipment modifyEquipment(Equipment equipment);
}
