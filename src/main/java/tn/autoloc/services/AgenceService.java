package tn.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.autoloc.DTO.AgenceDTO;
import tn.autoloc.domain.classes.Agence;
import tn.autoloc.interfaces.IAGENCE;
import tn.autoloc.mapper.AgenceMapper;
import tn.autoloc.repository.AgenceRepository;
import tn.autoloc.repository.EmployeeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class AgenceService implements IAGENCE {
    private final AgenceRepository ar;
    private final EmployeeRepository er;
    private final AgenceMapper agenceMapper;

    @Override
    public AgenceDTO addAgence(AgenceDTO agenceDTO) {
        Agence agence = agenceMapper.toEntity(agenceDTO);
        return agenceMapper.toDto(ar.save(agence));
    }

    @Override
    public AgenceDTO getAgence(Long id) {
        Agence agence = ar.findById(id)
                .orElseThrow(() -> new RuntimeException("Agence non trouvée"));

        return agenceMapper.toDto(agence); // implémentation générée par MapStruct
    }

    @Override
    public List<AgenceDTO> getAllAgence() {
        return ar.findAll().stream()
                .map(agenceMapper::toDto)
                .toList();
    }

    @Override
    public void deleteAgenceById(long id) {
        ar.deleteById(id);
    }

    @Override
    public AgenceDTO modifyAgence(Long id, AgenceDTO agenceDTO) {
        ar.findById(id)
                .orElseThrow(() -> new RuntimeException("Agence non trouvée"));

        Agence agence = agenceMapper.toEntity(agenceDTO);
        agence.setIdAgence(id);
        return agenceMapper.toDto(ar.save(agence));
    }
}
