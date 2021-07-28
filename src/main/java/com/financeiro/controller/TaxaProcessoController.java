package com.financeiro.controller;


import com.financeiro.model.TaxaProcesso;
import com.financeiro.service.TaxaProcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/taxaProcesso")
@RestController
public class TaxaProcessoController {

    @Autowired
    TaxaProcessoService taxaProcessoService;

    @PostMapping
    public ResponseEntity <?> salvar (@RequestBody TaxaProcesso taxaProcesso){
        try {
            taxaProcesso = taxaProcessoService.salvar(taxaProcesso);
            return ResponseEntity.ok(taxaProcesso);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Erro ao salvar ");
        }
    }

    @GetMapping
    public ResponseEntity <?> listar (){
        try {
            List <TaxaProcesso> listaTaxaProcesso = taxaProcessoService.listarTaxaProcesso();
            return ResponseEntity.ok(listaTaxaProcesso);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Erro ao listar ");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <?> deletar (@PathVariable ("id")Long id){
        try {
            taxaProcessoService.deletar(id);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Erro ao deletar ");
        }
    }



}
