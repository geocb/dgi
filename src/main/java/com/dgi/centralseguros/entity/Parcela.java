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
public class Parcela {

    @Id
    @Column(nullable = false)
    private Integer chaveParcela;

    @Id
    @Column(nullable = false)
    private Integer nParcela;

    @Id
    @Column(nullable = false)
    private Integer tParcela;

    private Data vencimento;
    private Double valor;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "codPagamento")
    private FormaPagamento formaPagamento;

    private String cancelado;
}
