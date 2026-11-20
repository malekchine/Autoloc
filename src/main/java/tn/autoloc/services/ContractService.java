package tn.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.autoloc.domain.classes.Contract;
import tn.autoloc.interfaces.ICONTRACT;
import tn.autoloc.repository.ContractRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ContractService implements ICONTRACT {
    private final ContractRepository cr;

    @Override
    public Contract addContract(Contract contract) {
        return cr.save(contract);
    }

    @Override
    public Contract getContractById(long id) {
        return cr.findById(id).get();
    }

    @Override
    public List<Contract> getAllContract() {
        return cr.findAll();
    }

    @Override
    public void deleteContractById(long id) {
        cr.deleteById(id);
    }

    @Override
    public Contract modifyContract(Contract contract) {
        contract.setPaiements(cr.findById(contract.getIdContract()).get().getPaiements());
        return cr.save(contract);
    }
}

