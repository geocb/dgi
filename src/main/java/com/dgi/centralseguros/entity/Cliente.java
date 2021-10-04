package com.dgi.centralseguros.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codCliente;

    @Column(nullable = false)
    private String nomeCliente;

    private Integer tipoDoc;
    private Long cpf;
    private Long cnpj;
    private Long cnh;
    private String pessoa;
    private String descriDoc;
    private String numDoc;
    private Data dataDoc;
    private String orgaoDoc;
    private Data dataNascim;
    private String email;
    private String obs;
    private Character sexo;
    private Integer estCivil;
    private Data exame;
    private Data primeira;
    private String profissao;
    private Boolean mala;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "carta_codCartas")
    private Carta carta;
}
