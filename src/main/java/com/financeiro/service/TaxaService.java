package com.financeiro.service;


import com.financeiro.model.Taxa;
import com.financeiro.repository.ITaxaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaxaService {


    @Autowired
    ITaxaRepository taxaRepository;


    public Taxa salvar(Taxa taxa) {
        taxa = taxaRepository.save(taxa);
        return taxa;
    }

    public void deletar (Long id){
        Optional<Taxa> taxa = taxaRepository.findById(id);
        if (taxa.isPresent()){
            taxaRepository.delete(taxa.get());
        }
    }


    public List<Taxa> listarTaxa(){
        return taxaRepository.findAll();

    }
}
