package com.dgi.centralseguros.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cobertura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codCobertura;

    private Integer ramoCoberturas;
    private String descricaoCoberturas;
    private Integer rcfDm;
    private Integer rcfDc;
    private Double franquia;
    private Double carroceria;
    private Integer appMorte;
    private Integer appInvalidez;
    private Integer appDMH;
    private Integer dMorais;

    @ManyToMany(mappedBy = "naturCobert")
    Set<Natureza> natur;
}
