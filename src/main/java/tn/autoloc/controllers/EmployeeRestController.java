package tn.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.autoloc.DTO.EmployeeDTO;
import tn.autoloc.interfaces.IEMPLOYEE;
import tn.autoloc.interfaces.IRH;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Employee")

public class EmployeeRestController {
    IEMPLOYEE employeeService;
    IRH employeeRH;

    // http://localhost:8089/Employee/retrieve-all-Employees
    @GetMapping("/retrieve-all-Employees")
    public List<EmployeeDTO> getEmployees() {
        return employeeService.getAllEmployee();
    }

    // http://localhost:8089/Employee/retrieve-Employee/8
    @GetMapping("/retrieve-Employee/{Employee-id}")
    public EmployeeDTO retrieveEmployee(@PathVariable("Employee-id") Long employeeId) {

        return employeeService.getEmployee(employeeId);
    }

    // http://localhost:8089/Employee/add-Employee
    @PostMapping("/add-Employee")
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO c) {

        return employeeService.addEmployee(c);
    }

    // http://localhost:8089/Employee/remove-Employee/{Employee-id}
    @DeleteMapping("/remove-Employee/{Employee-id}")
    public void removeEmployee(@PathVariable("Employee-id") Long employeeId) {
        employeeService.deleteEmployeeById(employeeId);
    }

    // http://localhost:8089/Employee/modify-Employee/{Employee-id}
    @PutMapping("/modify-Employee/{Employee-id}")
    public EmployeeDTO modifyEmployee(@PathVariable("Employee-id") Long employeeId, @RequestBody EmployeeDTO c) {

        return employeeService.modifyEmployee(employeeId, c);
    }

    @PutMapping("/removeFromAgence/{idEmployee}")
    public EmployeeDTO desaffectEmpFromAgence(@PathVariable("idEmployee") Long idEmployee) {
        return employeeRH.desaffecterEmploye(idEmployee);
    }
    @PutMapping("/affectEmpToAgence/{idAgence}/{idEmployee}")
    public EmployeeDTO affectEmpToAgence(@PathVariable("idEmployee") Long idEmployee, @PathVariable("idAgence") Long idAgence) {
        return employeeRH.affecterEmploye(idEmployee, idAgence);
    }
}
