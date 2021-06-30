package com.financeiro.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Processo {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne()
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;
    @ManyToOne()
    @JoinColumn(name = "importadora_id", referencedColumnName = "id")
    private Importadora importadora;
    private Date dataAtracacao;
    private String canal;
    private Long DI;
    private Date dataRegistro;
    private String HBL;
    @ManyToOne()
    @JoinColumn(name = "armazenagem_id", referencedColumnName = "id")
    private Armazenagem armazenagem;
    private String produto;
    @OneToMany(mappedBy = "processo")
    private List<TaxaProcesso> taxas;


}
