package tn.autoloc.interfaces;

import tn.autoloc.DTO.EmployeeDTO;

import java.util.List;

public interface IEMPLOYEE  {
    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO);
    public EmployeeDTO getEmployee(Long id);
    public List<EmployeeDTO> getAllEmployee();
    public void deleteEmployeeById(long id);
    public EmployeeDTO modifyEmployee(Long id, EmployeeDTO employeeDTO);
}
