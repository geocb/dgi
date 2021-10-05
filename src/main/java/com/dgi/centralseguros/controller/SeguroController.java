package com.dgi.centralseguros.controller;

import com.dgi.centralseguros.dto.MessageResponseDTO;
import com.dgi.centralseguros.entity.Seguro;
import com.dgi.centralseguros.repository.SeguroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/seguros")
public class SeguroController {

    private SeguroRepository seguroRepository;

    @Autowired
    public SeguroController(SeguroRepository seguroRepository) {
        this.seguroRepository = seguroRepository;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Seguro seguro) {
        Seguro savedSeguro = seguroRepository.save(seguro);
        return MessageResponseDTO.builder()
                .message("Seguro criado com Codigo Seguro " + savedSeguro.getCodSeguro())
                .build();
    }
}
