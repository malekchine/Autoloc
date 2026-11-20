package tn.autoloc.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tn.autoloc.DTO.EmployeeDTO;
import tn.autoloc.domain.classes.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mapping(target = "nomAgence", source = "agence.nom") // champ d'une autre entité
    EmployeeDTO toDto(Employee employee);

    @Mapping(target = "idEmployee", ignore = true) // l'id n'est pas dans le DTO
    @Mapping(target = "agence", ignore = true)     // l'agence se gère par affecter / desaffecter
    Employee toEntity(EmployeeDTO employeeDTO);
    // MapStruct génère automatiquement l'implémentation !
}
