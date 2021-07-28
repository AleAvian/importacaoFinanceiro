package com.financeiro.controller;

import com.financeiro.model.Armazenagem;
import com.financeiro.service.ArmazenagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/armazenagem")


@RestController
public class ArmazenagemController {

    @Autowired
    private ArmazenagemService armazenagemService;

    @PostMapping
    public ResponseEntity<?> salvar (@RequestBody Armazenagem armazenagem) {
        try {
            armazenagem = armazenagemService.salvar(armazenagem);
            return ResponseEntity.ok(armazenagem);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Erro ao salvar ");
        }
    }

    @GetMapping
    public ResponseEntity<?> listar(){
        try {
            List<Armazenagem> listaArmazenagem = armazenagemService.listarArmazem();
            return ResponseEntity.ok(listaArmazenagem);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Erro ao Listar ");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable("id") Long id){
        try{
            armazenagemService.delete(id);
            return  ResponseEntity.ok().build();
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Erro ao deletar ");
        }
    }


}
