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
public class Carta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codCartas;

    private String aniversario;
    private Data renovacao;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "codLicencia")
    private Licenciamento licenciamento;

    private String finalAniver;
    private String finalRenov;
    private String finalLicenciam;
    private Boolean margemAniver;
    private Boolean margemRenov;
    private Boolean margemLicenciam;
    private String textoCNH;
    private String finalCNH;
    private String margemCNH;
    private String textoRecibo;
    private String valorRecibo;
    private String produtorRecibo;
    private String cidadeRecibo;
    private Long cpfRecibo;
    private String ordem;
}
