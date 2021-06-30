package com.financeiro.service;


import com.financeiro.repository.ITaxaProcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TaxaProcessoService {

    @Autowired
    ITaxaProcessoRepository processoRepository;


}
