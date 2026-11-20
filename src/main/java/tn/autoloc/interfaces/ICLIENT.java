package tn.autoloc.interfaces;

import tn.autoloc.domain.classes.Client;

import java.util.List;

public interface ICLIENT  {
    public Client addClient(Client Client);
    public Client getClientById(long id);
    public List<Client> getAllClient();
    public void deleteClientById(long id);
    public Client modifyClient(Client client);
}