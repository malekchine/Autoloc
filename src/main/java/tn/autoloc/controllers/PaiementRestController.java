package tn.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.autoloc.domain.classes.Paiement;
import tn.autoloc.interfaces.IPAIEMENT;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Paiement")

public class PaiementRestController {
    IPAIEMENT PaiementService;

    // http://localhost:8089/gestionPaiements/Paiement/retrieve-all-Paiements
    @GetMapping("/retrieve-all-Paiements")
    public List<Paiement> getPaiements() {
        List<Paiement> listPaiements = PaiementService.getAllPaiement();
        return listPaiements;
    }

    // http://localhost:8089/gestionPaiements/Paiement/retrieve-Paiement/8
    @GetMapping("/retrieve-Paiement/{Paiement-id}")
    public Paiement retrievePaiement(@PathVariable("Paiement-id") Long PaiementId) {
        Paiement Paiement =
                PaiementService.getPaiementById(PaiementId);
        return Paiement;
    }

    // http://localhost:8089/gestionPaiements/Paiement/add-Paiement
    @PostMapping("/add-Paiement")
    public Paiement addPaiement(@RequestBody Paiement c) {
        Paiement Paiement = PaiementService.addPaiement(c);
        return
                Paiement;
    }

    // http://localhost:8089/gestionPaiements/Paiement/remove-Paiement/{Paiement-id}
    @DeleteMapping("/remove-Paiement/{Paiement-id}")
    public void removePaiement(@PathVariable("Paiement-id") Long PaiementId) {
        PaiementService.deletePaiementById(PaiementId);
    }

    // http://localhost:8089/gestionPaiements/Paiement/modify-Paiement
    @PutMapping("/modify-Paiement")
    public Paiement modifyPaiement(@RequestBody Paiement c) {
        Paiement Paiement = PaiementService.modifyPaiement(c);
        return Paiement;
    }
}
