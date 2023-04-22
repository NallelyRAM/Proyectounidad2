package com.example.Clientes.Controller;

import com.example.Clientes.Entity.Client;
import com.example.Clientes.Services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/versiones/clientes")
public class ClientController {

    @Autowired
    private final CServices clientServices;

    public ClientController(CServices clientServices) {
        this.clientServices = clientServices;
    }

    @GetMapping("{idCliente}")
    public Optional<Client> getById(@PathVariable("idCliente") Integer id){
        return clientServices.getClient(id);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Client cliente){
        clientServices.saveOrUpdate(cliente);
    }

    @GetMapping
    public Optional<Client> getCliente(Integer id){
        return clientServices.getClient(id);
    }

    @DeleteMapping("{idCliente}")
    public void deleteCliente(@PathVariable("idCliente") Integer id){
        clientServices.detele(id);
    }
}
