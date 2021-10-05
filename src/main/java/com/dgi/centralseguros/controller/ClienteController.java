package com.dgi.centralseguros.controller;

import com.dgi.centralseguros.dto.MessageResponseDTO;
import com.dgi.centralseguros.entity.Cliente;
import com.dgi.centralseguros.repository.ClienteRepository;
import com.dgi.centralseguros.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    private ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public MessageResponseDTO create (@RequestBody Cliente cliente) {
        return clienteService.create(cliente);
    }
}
