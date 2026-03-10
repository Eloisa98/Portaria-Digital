package com.condominio.model;

public class Visitante {
    private int id;
    private String nome;
    private String documento;
    private String foto;

    public Visitante(int id,String nome,String documento,String foto){
        this.id=id;
        this.nome=nome;
        this.documento=documento;
        this.foto=foto;
    }

    public int getId(){ return id; }
    public String getNome(){ return nome; }

    public void solicitarAcesso(){
        System.out.println("Visitante solicitando acesso.");
    }
}