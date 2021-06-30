package com.financeiro.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity


public class Importadora {

    @Id
    @GeneratedValue
    private Long id;
    private String nomeImportador;
    private String nomeBanco;
    private  String nomeAgencia;
    private String numeroConta;
}
