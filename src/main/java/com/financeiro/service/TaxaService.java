package com.financeiro.service;


import com.financeiro.model.Taxa;
import com.financeiro.repository.ITaxaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxaService {


    @Autowired
    ITaxaRepository taxaRepository;


    public Taxa salvar(Taxa taxa) {
        taxa = taxaRepository.save(taxa);
        return taxa;
    }

    public void deletar (Taxa taxa){
        taxaRepository.delete(taxa);
    }

    public List<Taxa> listarTaxa(){
        return taxaRepository.findAll();

    }
}
