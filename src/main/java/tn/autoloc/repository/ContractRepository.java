package tn.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.autoloc.domain.classes.Contract;

public interface ContractRepository extends JpaRepository<Contract,Long> {
}
