package com.financeiro.service;


import com.financeiro.repository.IProcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProcessoService {

    @Autowired
    IProcessoRepository processoRepository;
}
