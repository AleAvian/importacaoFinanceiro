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



public class Taxa {

    @Id
    @GeneratedValue
    private Long id;
    private String nomeDaTaxa;
}
