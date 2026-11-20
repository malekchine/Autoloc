package tn.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.autoloc.domain.classes.Contract;
import tn.autoloc.interfaces.ICONTRACT;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Contract")

public class ContractRestController {
    ICONTRACT contractService;

    // http://localhost:8089/gestionContracts/Contract/retrieve-all-Contracts
    @GetMapping("/retrieve-all-Contracts")
    public List<Contract> getContracts() {
        return contractService.getAllContract();
    }

    // http://localhost:8089/gestionContracts/Contract/retrieve-Contract/8
    @GetMapping("/retrieve-Contract/{Contract-id}")
    public Contract retrieveContract(@PathVariable("Contract-id") Long contractId) {

        return contractService.getContractById(contractId);
    }

    // http://localhost:8089/gestionContracts/Contract/add-Contract
    @PostMapping("/add-Contract")
    public Contract addContract(@RequestBody Contract c) {
        return contractService.addContract(c);
    }

    // http://localhost:8089/gestionContracts/Contract/remove-Contract/{Contract-id}
    @DeleteMapping("/remove-Contract/{Contract-id}")
    public void removeContract(@PathVariable("Contract-id") Long contractId) {
        contractService.deleteContractById(contractId);
    }

    // http://localhost:8089/gestionContracts/Contract/modify-Contract
    @PutMapping("/modify-Contract")
    public Contract modifyContract(@RequestBody Contract c) {

        return contractService.modifyContract(c);
    }
}