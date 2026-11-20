package tn.autoloc.interfaces;

import tn.autoloc.DTO.EmployeeDTO;

public interface IRH {
    public EmployeeDTO desaffecterEmploye(Long idEmployee);

    public EmployeeDTO affecterEmploye(Long idEmployee, Long idAgence);
}
