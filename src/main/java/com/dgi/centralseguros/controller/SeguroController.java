package com.dgi.centralseguros.controller;

import com.dgi.centralseguros.dto.MessageResponseDTO;
import com.dgi.centralseguros.entity.Seguro;
import com.dgi.centralseguros.repository.SeguroRepository;
import com.dgi.centralseguros.service.SeguroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/seguros")
public class SeguroController {

    private SeguroService seguroService;

    @Autowired
    public SeguroController(SeguroService seguroService) {
        this.seguroService = seguroService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Seguro seguro) {
        return seguroService.create(seguro);
    }
}
