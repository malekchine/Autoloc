package tn.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.autoloc.domain.classes.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
