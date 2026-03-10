package com.condominio.model;

public class Sindico {
    private int id;
    private String nome;

    public Sindico(int id,String nome){
        this.id=id;
        this.nome=nome;
    }

    public void gerarRelatorio(){
        System.out.println("Relatorio gerado pelo sindico.");
    }
}