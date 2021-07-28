package com.financeiro.controller;


import com.financeiro.model.Taxa;
import com.financeiro.service.TaxaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/taxa")
@RestController
public class TaxaController {

    @Autowired
    TaxaService taxaService;

    @PostMapping
    public ResponseEntity <?> salvar (@RequestBody Taxa taxa){
        try {
            taxa = taxaService.salvar(taxa);
            return ResponseEntity.ok(taxa);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Erro ao salvar ");
        }
    }


    @GetMapping
    public ResponseEntity <?> listar (){
        try{
            List <Taxa> listaTaxa = taxaService.listarTaxa();
            return ResponseEntity.ok(listaTaxa);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Erro ao listar ");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <?> deletar (@PathVariable ("id")Long id){
        try {
            taxaService.deletar(id);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Erro ao deletar ");
        }
    }


}
