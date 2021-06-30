package com.financeiro.service;


import com.financeiro.model.Importadora;
import com.financeiro.repository.IImportadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ImportadoraService {

    @Autowired
    IImportadoraRepository importadoraRepository;

    public Importadora salvar(Importadora importadora) {
        importadora = importadoraRepository.save(importadora);
        return importadora;
    }

    public List<Importadora> listarImportadora(){
        return importadoraRepository.findAll();

    }
}
