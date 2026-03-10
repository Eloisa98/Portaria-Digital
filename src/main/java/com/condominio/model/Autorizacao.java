package com.condominio.model;

public class Autorizacao {
    private int id;
    private int visitanteId;
    private int moradorId;
    private String dataInicio;
    private String dataFim;
    private String status;

    public Autorizacao(int id,int visitanteId,int moradorId,String inicio,String fim,String status){
        this.id=id;
        this.visitanteId=visitanteId;
        this.moradorId=moradorId;
        this.dataInicio=inicio;
        this.dataFim=fim;
        this.status=status;
    }
}