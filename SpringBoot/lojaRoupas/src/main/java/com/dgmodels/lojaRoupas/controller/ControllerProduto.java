package com.dgmodels.lojaRoupas.controller;


import com.dgmodels.lojaRoupas.model.DadosCadastroRoupa;
import jdk.jfr.Registered;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/roupa")
public class ControllerProduto {

    @PostMapping
    public void cadastrarProduto(@RequestBody DadosCadastroRoupa dados ){
        System.out.println(dados);

    }
}
