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
public class Licenciamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codLicencia;

    private Integer veiculo;
    private Integer caminhao;
    private String tipoVeiculo;
}
