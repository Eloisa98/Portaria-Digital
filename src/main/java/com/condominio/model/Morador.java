package com.condominio.model;

public class Morador {
    private int id;
    private String nome;
    private String apartamento;
    private String telefone;

    public Morador(int id, String nome, String apartamento, String telefone){
        this.id=id;
        this.nome=nome;
        this.apartamento=apartamento;
        this.telefone=telefone;
    }

    public int getId(){ return id; }
    public String getNome(){ return nome; }
    public String getApartamento(){ return apartamento; }
    public String getTelefone(){ return telefone; }

    public void autorizarVisitante(){
        System.out.println("Morador autorizou visitante.");
    }
}