package tn.autoloc.interfaces;

import tn.autoloc.DTO.AgenceDTO;

import java.util.List;

public interface IAGENCE  {
    public AgenceDTO addAgence(AgenceDTO agenceDTO);
    public AgenceDTO getAgence(Long id);
    public List<AgenceDTO> getAllAgence();
    public void deleteAgenceById(long id);
    public AgenceDTO modifyAgence(Long id, AgenceDTO agenceDTO);
}
