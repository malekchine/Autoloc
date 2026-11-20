package tn.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.autoloc.domain.classes.Paiement;
import tn.autoloc.interfaces.IPAIEMENT;
import tn.autoloc.repository.PaiementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaiementService implements IPAIEMENT {
    private final PaiementRepository pr;

    @Override
    public Paiement addPaiement(Paiement Paiement) {
        return pr.save(Paiement);
    }

    @Override
    public Paiement getPaiementById(long id) {
        return pr.findById(id).get();
    }

    @Override
    public List<Paiement> getAllPaiement() {
        return pr.findAll();
    }

    @Override
    public void deletePaiementById(long id) {
        pr.deleteById(id);
    }

    @Override
    public Paiement modifyPaiement(Paiement paiement) {
        return pr.save(paiement);
    }
}
