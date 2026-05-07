package com.dgmodels.lojaRoupas.controller;


import com.dgmodels.lojaRoupas.model.DadosCadastroRoupa;
import com.dgmodels.lojaRoupas.model.Roupa;
import com.dgmodels.lojaRoupas.repository.RoupaRepository;
import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/roupa")
public class ControllerProduto {

    @Autowired
    private RoupaRepository roupaRepository; // esse roupaRepository possui todos os métodos: Save, Find (buscar e recuperar dados do BD), Delete.

    @PostMapping
    public void cadastrarProduto(@RequestBody DadosCadastroRoupa dados ){
        System.out.println(dados);
            roupaRepository.save(new Roupa(dados));
    }

    @GetMapping
    public List<Roupa> listarProdutos(){
        return roupaRepository.findAll();
    }
}
