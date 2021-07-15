package com.financeiro.service;


import com.financeiro.model.Processo;
import com.financeiro.repository.IProcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProcessoService {

    @Autowired
    IProcessoRepository processoRepository;

    public Processo salvar(Processo processo) {
        processo = processoRepository.save(processo);
        return processo;
    }

    public void deletar(Processo processo){
        processoRepository.delete(processo);
    }

    public List<Processo> listarProcesso(){
        return processoRepository.findAll();

    }

}
