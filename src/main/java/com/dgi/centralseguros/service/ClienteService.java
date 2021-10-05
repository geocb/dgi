package com.dgi.centralseguros.service;

import com.dgi.centralseguros.dto.MessageResponseDTO;
import com.dgi.centralseguros.entity.Cliente;
import com.dgi.centralseguros.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public MessageResponseDTO create(Cliente cliente) {
        Cliente savedCliente = clienteRepository.save(cliente);
        return MessageResponseDTO.builder()
                .message("Cliente criado com Codigo Cliente" + savedCliente.getCodCliente())
                .build();
    }
}