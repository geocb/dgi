package com.dgi.centralseguros.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Seguro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codSeguro;

    @Column(nullable = false)
    private String seguro;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "cliente_codCliente")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "produtor_codProdutor")
    private Produtor produtor;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "seguradora_codSeguradora")
    private Seguradora seguradora;

    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "ramo_codRamo")
    private Ramo ramo;

    private Double valor;
    private String descrSinistro;
    private Data dataInicio;
    private Data dataFinal;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "marca_codMarca")
    private Marca marca;

    private String modelo;
    private String placa;
    private Integer anoFab;
    private Integer anoMod;
    private Integer portas;
    private Boolean tipoIs;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "cobertura_codCobertura")
    private Cobertura cobertura;

    private Integer is;
    private String obs;
    private Boolean naoRenova;
    private String chassi;
    private Boolean sinistro;
    private Long proposta;
    private Long apolice;
    private Integer item;
    private Integer sucursal;
    private String ci;
    private String cr;
    private Integer bonus;
    private String cor;
    private String vistorias;
    private String clausulas;
    private Boolean zero;
    private String nf;
    private Boolean valorNf;
    private Data dtSaida;
    private String concessionaria;

    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "licenciamento_codLicencia")
    private Licenciamento licenciamento;

    private String endossos;
    private Boolean ativo;
    private String iscoCobertura;
    private String franquiaCobertura;
    private Long renavam;
    private Integer kitGas;
    private Boolean vidros;
    private Boolean retrovisores;
    private Boolean lantenas;
    private Integer valorKitGas;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "parcela_chaveParcela")
    private Parcela parcela;
}
