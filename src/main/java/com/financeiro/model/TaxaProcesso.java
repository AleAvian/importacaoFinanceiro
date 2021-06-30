package com.financeiro.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class TaxaProcesso {

    @Id
    @GeneratedValue
    private Long id;
    private Date dataPagamento;
    private Float valorDoPagamento;
    @ManyToOne()
    @JoinColumn(name = "taxa_id", referencedColumnName = "id")
    private Taxa taxa;
    @JsonIgnore
    @ManyToOne()
    @JoinColumn(name = "processo_id", referencedColumnName = "id")
    private Processo processo;
    private String quemPagou;
}
