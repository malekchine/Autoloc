package tn.autoloc.interfaces;

import tn.autoloc.domain.classes.Contract;

import java.util.List;

public interface ICONTRACT  {
    public Contract addContract(Contract Contract);
    public Contract getContractById(long id);
    public List<Contract> getAllContract();
    public void deleteContractById(long id);
    public Contract modifyContract(Contract contract);
}