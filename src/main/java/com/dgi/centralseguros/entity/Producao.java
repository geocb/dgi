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
public class Producao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codProducao;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "nParcela")
    @JoinColumn(name = "chaveParcela")
    private Parcela parcela;

    private Data data;
    private Double valorProd;
    private String tipo;
    private String cancelado;
}
