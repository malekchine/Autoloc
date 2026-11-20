package tn.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.autoloc.domain.classes.Equipment;
import tn.autoloc.domain.classes.Maintenance;
import tn.autoloc.interfaces.IMAINTENANCE;
import tn.autoloc.repository.MaintenanceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class MaintenanceService implements IMAINTENANCE {
    private final MaintenanceRepository mr;

    @Override
    public Maintenance addMaintenance(Maintenance Maintenance) {
        return mr.save(Maintenance);
    }

    @Override
    public Maintenance getMaintenanceById(long id) {
        return mr.findById(id).get();
    }

    @Override
    public List<Maintenance> getAllMaintenance() {
        return mr.findAll();
    }

    @Override
    public void deleteMaintenanceById(long id) {
        mr.deleteById(id);
    }

    @Override
    public Maintenance modifyMaintenance(Maintenance maintenance) {
        return mr.save(maintenance);
    }
}
