package tn.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.autoloc.domain.classes.Client;
import tn.autoloc.interfaces.ICLIENT;
import tn.autoloc.repository.ClientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService implements ICLIENT {
    private final ClientRepository cl;

    @Override
    public Client addClient(Client client) {
        return cl.save(client);
    }

    @Override
    public Client getClientById(long id) {
        return cl.findById(id).get();
    }

    @Override
    public List<Client> getAllClient() {
        return cl.findAll();
    }

    @Override
    public void deleteClientById(long id) {
        cl.deleteById(id);
    }

    @Override
    public Client modifyClient(Client client) {
        return cl.save(client);
    }
}
