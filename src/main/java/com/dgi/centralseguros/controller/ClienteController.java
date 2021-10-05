package com.dgi.centralseguros.controller;

import com.dgi.centralseguros.dto.MessageResponseDTO;
import com.dgi.centralseguros.entity.Cliente;
import com.dgi.centralseguros.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteController(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    @PostMapping
    public MessageResponseDTO create (@RequestBody Cliente cliente) {
        Cliente savedCliente = clienteRepository.save(cliente);
        return MessageResponseDTO.builder()
                .message("Cliente criado com Codigo Cliente" + savedCliente.getCodCliente())
                .build();
    }
}
