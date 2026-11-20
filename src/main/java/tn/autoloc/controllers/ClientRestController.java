package tn.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.autoloc.domain.classes.Client;
import tn.autoloc.interfaces.ICLIENT;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Client")

public class ClientRestController {
    ICLIENT clientService;

    // http://localhost:8089/gestionClients/Client/retrieve-all-Clients
    @GetMapping("/retrieve-all-Clients")
    public List<Client> getClients() {

        return clientService.getAllClient();
    }

    // http://localhost:8089/gestionClients/Client/retrieve-Client/8
    @GetMapping("/retrieve-Client/{Client-id}")
    public Client retrieveClient(@PathVariable("Client-id") Long clientId) {
        return clientService.getClientById(clientId);
    }

    // http://localhost:8089/gestionClients/Client/add-Client
    @PostMapping("/add-Client")
    public Client addClient(@RequestBody Client c) {

        return clientService.addClient(c);
    }

    // http://localhost:8089/gestionClients/Client/remove-Client/{Client-id}
    @DeleteMapping("/remove-Client/{Client-id}")
    public void removeClient(@PathVariable("Client-id") Long clientId) {
        clientService.deleteClientById(clientId);
    }

    // http://localhost:8089/gestionClients/Client/modify-Client
    @PutMapping("/modify-Client")
    public Client modifyClient(@RequestBody Client c) {
        return clientService.modifyClient(c);
    }
}