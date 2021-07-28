package com.financeiro.controller;

import com.financeiro.model.Cliente;
import com.financeiro.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cliente")
@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody Cliente cliente) {
        try {
            cliente = clienteService.salvar(cliente);
            return ResponseEntity.ok(cliente);
        }catch (Exception e){
            e.printStackTrace();
            return  ResponseEntity.internalServerError().body("Erro ao Salvar ");
        }
    }

    @GetMapping
    public ResponseEntity <?> Listar (){
        try{
            List<Cliente> listaCliente  = clienteService.listarCliente();
            return ResponseEntity.ok(listaCliente);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Erro ao Listar ");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar (@PathVariable("id") Long id){
        try {
            clienteService.deletar(id);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Erro ao deletar ");
        }
    }

}
