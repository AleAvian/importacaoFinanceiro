package com.financeiro.service;


import com.financeiro.model.Armazenagem;
import com.financeiro.repository.IArmazenagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ArmazenagemService {

    @Autowired
    private IArmazenagemRepository armazenagemRepository;

    public Armazenagem salvar(Armazenagem armazenagem) {
        armazenagem = armazenagemRepository.save(armazenagem);
        return armazenagem;
    }

    public void delete (Long id){
        Optional<Armazenagem> armagenagem = armazenagemRepository.findById(id);
        if(armagenagem.isPresent()){
        armazenagemRepository.delete(armagenagem.get());
        }
    }

    public List<Armazenagem> listarArmazem(){
        return armazenagemRepository.findAll();
    }
}

