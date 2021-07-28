package com.financeiro.service;


import com.financeiro.model.Importadora;
import com.financeiro.repository.IImportadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ImportadoraService {

    @Autowired
    IImportadoraRepository importadoraRepository;

    public Importadora salvar(Importadora importadora) {
        importadora = importadoraRepository.save(importadora);
        return importadora;
    }

    public void delete (Long id){
        Optional<Importadora> importadora = importadoraRepository.findById(id);
        if(importadora.isPresent()){
            importadoraRepository.delete(importadora.get());
        }
    }

    public List<Importadora> listarImportadora(){
        return importadoraRepository.findAll();

    }
}
