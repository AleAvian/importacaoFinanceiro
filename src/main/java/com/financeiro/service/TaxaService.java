package com.financeiro.service;


import com.financeiro.repository.ITaxaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TaxaService {


    @Autowired
    ITaxaRepository taxaRepository;
}
