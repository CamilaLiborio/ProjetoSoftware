package com.dgmodels.lojaRoupas.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "roupas") // tabela mysql
@Entity(name = "Roupa") // classe
@Getter
@Setter
@AllArgsConstructor //Com todos os valores
@NoArgsConstructor //Sem valores

public class Roupa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeProduto; // erro do P maiusculo
    private String marca;
    @Enumerated(EnumType.STRING)
    private Tamanho tamanho;
    private double preco;
    private int quantidade;


    public Roupa(DadosCadastroRoupa dados){
        this.nomeProduto = dados.nomeProduto();
        this.marca = dados.marca();
        this.tamanho = dados.tamanho();
        this.preco = dados.preco();
        this.quantidade = dados.quantidade();

    }
}
