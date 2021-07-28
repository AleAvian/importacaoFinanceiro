package com.financeiro.service;


import com.financeiro.model.TaxaProcesso;
import com.financeiro.repository.ITaxaProcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class TaxaProcessoService {

    @Autowired
    ITaxaProcessoRepository taxaProcessoRepository;


    public TaxaProcesso salvar(TaxaProcesso taxaProcesso) {
        taxaProcesso = taxaProcessoRepository.save(taxaProcesso);
        return taxaProcesso;
    }

    public void deletar (Long id){
        Optional<TaxaProcesso> taxaProcesso = taxaProcessoRepository.findById(id);
        if (taxaProcesso.isPresent()){
            taxaProcessoRepository.delete(taxaProcesso.get());
        }
    }

    public List<TaxaProcesso> listarTaxaProcesso(){
        return taxaProcessoRepository.findAll();

    }


}
