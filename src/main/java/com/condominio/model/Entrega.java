package com.condominio.model;

public class Entrega {
    private int id;
    private int moradorId;
    private String descricao;
    private String dataRecebimento;
    private String status;

    public Entrega(int id,int moradorId,String descricao,String dataRecebimento,String status){
        this.id=id;
        this.moradorId=moradorId;
        this.descricao=descricao;
        this.dataRecebimento=dataRecebimento;
        this.status=status;
    }
}