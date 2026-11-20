package tn.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.autoloc.DTO.AgenceDTO;
import tn.autoloc.interfaces.IAGENCE;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Agence")

public class AgenceRestController {
    IAGENCE agenceService;

    // http://localhost:8089/Agence/retrieve-all-Agences
    @GetMapping("/retrieve-all-Agences")
    public List<AgenceDTO> getAgences() {

        return agenceService.getAllAgence();
    }
    // http://localhost:8089/Agence/retrieve-Agence/8
    @GetMapping("/retrieve-Agence/{Agence-id}")
    public AgenceDTO retrieveAgence(@PathVariable("Agence-id") Long agenceId) {

        return agenceService.getAgence(agenceId);
    }

    // http://localhost:8089/Agence/add-Agence
    @PostMapping("/add-Agence")
    public AgenceDTO addAgence(@RequestBody AgenceDTO c) {

        return agenceService.addAgence(c);
    }

    //http://localhost:8089/Agence/remove-Agence/{Agence-id}
    @DeleteMapping("/remove-Agence/{Agence-id}")
    public void removeAgence(@PathVariable ("Agence-id") Long agenceId) { agenceService.deleteAgenceById(agenceId);
    }

    // http://localhost:8089/Agence/modify-Agence/{Agence-id}
    @PutMapping("/modify-Agence/{Agence-id}")
    public AgenceDTO modifyAgence(@PathVariable("Agence-id") Long agenceId, @RequestBody AgenceDTO c) {

        return agenceService.modifyAgence(agenceId, c);
    }
}
