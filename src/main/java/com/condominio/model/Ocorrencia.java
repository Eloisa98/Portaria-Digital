package com.condominio.model;

public class Ocorrencia {
    private int id;
    private String descricao;
    private String data;
    private String envolvidos;
    private int porteiroId;

    public Ocorrencia(int id,String descricao,String data,String envolvidos,int porteiroId){
        this.id=id;
        this.descricao=descricao;
        this.data=data;
        this.envolvidos=envolvidos;
        this.porteiroId=porteiroId;
    }
}