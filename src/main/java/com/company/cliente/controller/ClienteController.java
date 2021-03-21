package com.company.cliente.controller;

import com.company.cliente.model.Cliente;
import com.company.cliente.service.impl.ClienteServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ClienteController {

    private final ClienteServiceImpl service;

    public ClienteController(ClienteServiceImpl service) {
        this.service = service;
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente){
        return service.salvar(cliente);
    }

    @GetMapping
    public List<Cliente> listar(){
        return service.listar();
    }
}
