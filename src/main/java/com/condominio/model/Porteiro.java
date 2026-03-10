package com.condominio.model;

public class Porteiro {
    private int id;
    private String nome;
    private String matricula;

    public Porteiro(int id,String nome,String matricula){
        this.id=id;
        this.nome=nome;
        this.matricula=matricula;
    }

    public void registrarEntrada(){
        System.out.println("Entrada registrada.");
    }

    public void registrarSaida(){
        System.out.println("Saida registrada.");
    }
}