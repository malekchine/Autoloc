package tn.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.autoloc.domain.classes.Agence;

public interface AgenceRepository extends JpaRepository<Agence,Long> {
}
