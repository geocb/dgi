package com.dgi.centralseguros.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Natureza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codNtureza;

    private String nomeNaturza;
    private Integer ramoNatureza;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "cobertura_codCobertura")
    private Cobertura cobertura;
}
