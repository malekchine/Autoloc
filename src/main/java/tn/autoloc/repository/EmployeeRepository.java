package tn.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.autoloc.domain.classes.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
