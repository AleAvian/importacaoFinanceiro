package com.financeiro.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity



public class Cliente {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String refCliente;
    private String intermediario;


}
