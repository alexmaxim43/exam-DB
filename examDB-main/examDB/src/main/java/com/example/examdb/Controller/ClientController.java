package com.example.examdb.Controller;

import com.example.examdb.Exceptions.ClientAlreadyExist;
import com.example.examdb.Exceptions.ClientWithIdNotFound;
import com.example.examdb.Service.ClientService;
import lombok.RequiredArgsConstructor;
import com.example.examdb.model.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @PostMapping("/addClient")
    public String addClient(@RequestBody Client client) throws ClientAlreadyExist {
        return clientService.addClient(client);
    }

    @GetMapping("/getAllClients")
    public List<Client> getAllCLients(){
        return clientService.getAllClients();
    }

    @GetMapping("/getClient/{id}")
    public ResponseEntity<Client> getById(@PathVariable("id") Integer id) throws ClientWithIdNotFound {
        Client client = clientService.getClientById(id);
        if (client == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        return ResponseEntity.status(HttpStatus.OK).body(client);
    }
}
