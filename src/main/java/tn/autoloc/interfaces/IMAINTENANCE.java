package tn.autoloc.interfaces;

import tn.autoloc.domain.classes.Maintenance;

import java.util.List;

public interface IMAINTENANCE  {
    public Maintenance addMaintenance(Maintenance Maintenance);
    public Maintenance getMaintenanceById(long id);
    public List<Maintenance> getAllMaintenance();
    public void deleteMaintenanceById(long id);
    public Maintenance modifyMaintenance(Maintenance maintenance);
}
