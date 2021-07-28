package com.financeiro.service;


import com.financeiro.model.Cliente;
import com.financeiro.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ClienteService {

    @Autowired
    IClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        cliente = clienteRepository.save(cliente);
        return cliente;
    }

    public void deletar (Long id){
        Optional <Cliente> cliente = clienteRepository.findById(id);
        if(cliente.isPresent()){
            clienteRepository.delete(cliente.get());
        }
    }


    public List <Cliente> listarCliente(){
        return clienteRepository.findAll();
    }

}
