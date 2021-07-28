package com.financeiro.controller;


import com.financeiro.model.Processo;
import com.financeiro.service.ProcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/processo")
@RestController
public class ProcessoController {


    @Autowired
    ProcessoService processoService;

    @PostMapping
    public ResponseEntity <?> salvar (@RequestBody Processo processo){
        try{
            processo = processoService.salvar(processo);
            return ResponseEntity.ok(processo);
        }catch (Exception e ){
        e.printStackTrace();
        return ResponseEntity.internalServerError().body("Erro ao salvar ");
        }
    }

    @GetMapping
    public ResponseEntity <?> listar (){
        try {
            List<Processo> listaProcesso = processoService.listarProcesso();
            return ResponseEntity.ok(listaProcesso);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Erro ao listar ");
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity <?> deletar (@PathVariable ("id") Long id){
        try {
            processoService.deletar(id);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Erro ao deletar ");
        }
    }

}
