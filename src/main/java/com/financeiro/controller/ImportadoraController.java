package com.financeiro.controller;


import com.financeiro.model.Importadora;
import com.financeiro.service.ImportadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/importadora")
@RestController
public class ImportadoraController {

    @Autowired
    ImportadoraService importadoraService;

    @PostMapping
    public ResponseEntity<?> salvar (@RequestBody Importadora importadora){
        try {
            importadora = importadoraService.salvar(importadora);
            return ResponseEntity.ok(importadora);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Erro ao salvar ");
        }
    }

    @GetMapping
    public ResponseEntity <?> listar (){
        try{
            List<Importadora> listaImportadora = importadoraService.listarImportadora();
            return ResponseEntity.ok(listaImportadora);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Erro ao listar ");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar (@PathVariable ("id")Long id){
        try {
            importadoraService.delete(id);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Erro ao deletar ");
        }
    }


}
