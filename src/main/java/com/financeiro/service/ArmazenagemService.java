package com.financeiro.service;


import com.financeiro.model.Armazenagem;
import com.financeiro.repository.IArmazenagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ArmazenagemService {

    @Autowired
    private IArmazenagemRepository armazenagemRepository;

    public Armazenagem salvar(Armazenagem armazenagem) {
        armazenagem = armazenagemRepository.save(armazenagem);
        return armazenagem;
    }

    public void delete (Armazenagem armazenagem){
        armazenagemRepository.delete(armazenagem);

    }

    public List<Armazenagem> listarArmazem(){
        return armazenagemRepository.findAll();
    }
}

