package com.dgi.centralseguros.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produtor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codProdutor;

    private String nome;
    private String corretora;
    private String nomeCompl;
    private Long cpf;
    private Long cnpj;
    private Character pessoa;
    private Boolean porComissao;
    private Boolean tipoComissao;
    private String tipoRecibo;
}
