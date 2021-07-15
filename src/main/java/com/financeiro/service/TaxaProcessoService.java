package com.financeiro.service;


import com.financeiro.model.TaxaProcesso;
import com.financeiro.repository.ITaxaProcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class TaxaProcessoService {

    @Autowired
    ITaxaProcessoRepository taxaProcessoRepository;


    public TaxaProcesso salvar(TaxaProcesso taxaProcesso) {
        taxaProcesso = taxaProcessoRepository.save(taxaProcesso);
        return taxaProcesso;
    }

    public void deletar (TaxaProcesso taxaProcesso){
        taxaProcessoRepository.delete(taxaProcesso);
    }

    public List<TaxaProcesso> listarTaxaProcesso(){
        return taxaProcessoRepository.findAll();

    }


}
