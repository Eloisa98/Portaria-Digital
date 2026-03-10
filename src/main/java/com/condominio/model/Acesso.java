package com.condominio.model;

public class Acesso {
    private int id;
    private String tipoUsuario;
    private String dataHoraEntrada;
    private String dataHoraSaida;
    private int moradorId;
    private String veiculo;

    public Acesso(int id,String tipoUsuario,String entrada,String saida,int moradorId,String veiculo){
        this.id=id;
        this.tipoUsuario=tipoUsuario;
        this.dataHoraEntrada=entrada;
        this.dataHoraSaida=saida;
        this.moradorId=moradorId;
        this.veiculo=veiculo;
    }
}