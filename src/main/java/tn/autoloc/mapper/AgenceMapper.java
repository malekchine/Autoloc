package tn.autoloc.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tn.autoloc.DTO.AgenceDTO;
import tn.autoloc.domain.classes.Agence;

@Mapper(componentModel = "spring")
public interface AgenceMapper {

    AgenceDTO toDto(Agence agence);

    @Mapping(target = "idAgence", ignore = true)   // l'id n'est pas dans le DTO
    @Mapping(target = "vehicules", ignore = true)
    @Mapping(target = "employees", ignore = true)
    Agence toEntity(AgenceDTO agenceDTO);
    // MapStruct génère automatiquement l'implémentation !
}
