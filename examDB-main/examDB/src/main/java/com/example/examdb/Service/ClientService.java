package com.example.examdb.Service;

import com.example.examdb.Exceptions.ClientAlreadyExist;
import com.example.examdb.Exceptions.ClientWithIdNotFound;
import com.example.examdb.Repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import com.example.examdb.model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;

    public String addClient(Client client) throws ClientAlreadyExist {
        Client c = clientRepository.findClientByName(client.getName());
        if ( c != null && c.getPhoneNo().equals(client.getPhoneNo())){
            throw new ClientAlreadyExist();
        }
        else
        {
            client.setOrderList(new ArrayList<>());
            clientRepository.save(client);
        }
        return "Client added";
    }
    public Client getClientById(Integer id) throws ClientWithIdNotFound {
        Optional<Client> clientOPT = clientRepository.findById(id);
        if(clientOPT.isPresent())
            return clientOPT.get();
        else
            throw new ClientWithIdNotFound();
    }

    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }
}
