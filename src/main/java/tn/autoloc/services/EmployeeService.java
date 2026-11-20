package tn.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.autoloc.DTO.EmployeeDTO;
import tn.autoloc.domain.classes.Agence;
import tn.autoloc.domain.classes.Employee;
import tn.autoloc.interfaces.IEMPLOYEE;
import tn.autoloc.interfaces.IRH;
import tn.autoloc.mapper.EmployeeMapper;
import tn.autoloc.repository.AgenceRepository;
import tn.autoloc.repository.EmployeeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService implements IEMPLOYEE,IRH {
    private final EmployeeRepository er;
    private final AgenceRepository ar;
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = employeeMapper.toEntity(employeeDTO);
        return employeeMapper.toDto(er.save(employee));
    }

    @Override
    public EmployeeDTO getEmployee(Long id) {
        Employee employee = er.findById(id)
                .orElseThrow(() -> new RuntimeException("Employé non trouvé"));

        return employeeMapper.toDto(employee);
    }

    @Override
    public List<EmployeeDTO> getAllEmployee() {
        return er.findAll().stream()
                .map(employeeMapper::toDto)
                .toList();
    }

    @Override
    public void deleteEmployeeById(long id) {
        er.deleteById(id);
    }

    @Override
    public EmployeeDTO modifyEmployee(Long id, EmployeeDTO employeeDTO) {
        Employee existant = er.findById(id)
                .orElseThrow(() -> new RuntimeException("Employé non trouvé"));

        Employee employee = employeeMapper.toEntity(employeeDTO);
        employee.setIdEmployee(id);
        employee.setAgence(existant.getAgence());
        return employeeMapper.toDto(er.save(employee));
    }

    @Override
    public EmployeeDTO desaffecterEmploye(Long idEmployee) {
        Employee employee = er.findById(idEmployee).get();
        employee.setAgence(null);
        return employeeMapper.toDto(er.save(employee));
    }

    @Override
    public EmployeeDTO affecterEmploye(Long idEmployee, Long idAgence) {

        Agence agence = ar.findById(idAgence).get();
        Employee employee = er.findById(idEmployee).get();

        employee.setAgence(agence);

        return employeeMapper.toDto(er.save(employee));
    }
}
