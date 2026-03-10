package com.condominio.model;

public class Notificacao {
    private String mensagem;

    public Notificacao(String mensagem){
        this.mensagem=mensagem;
    }

    public void enviar(){
        System.out.println("Notificacao enviada: "+mensagem);
    }
}