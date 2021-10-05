package com.dgi.centralseguros.service;

import com.dgi.centralseguros.dto.MessageResponseDTO;
import com.dgi.centralseguros.entity.Seguro;
import com.dgi.centralseguros.repository.SeguroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeguroService {

    private SeguroRepository seguroRepository;

    @Autowired
    public SeguroService(SeguroRepository seguroRepository) {
        this.seguroRepository = seguroRepository;
    }

    public MessageResponseDTO create(Seguro seguro) {
        Seguro savedSeguro = seguroRepository.save(seguro);
        return MessageResponseDTO.builder()
                .message("Seguro criado com Codigo Seguro " + savedSeguro.getCodSeguro())
                .build();
    }
}
