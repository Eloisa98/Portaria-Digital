package com.condominio;

import com.condominio.model.*;

public class Main {
    public static void main(String[] args){

        Morador morador = new Morador(1,"Carlos","101","119999999");
        Visitante visitante = new Visitante(1,"Joao","123456","foto.jpg");
        Porteiro porteiro = new Porteiro(1,"Roberto","P01");

        visitante.solicitarAcesso();
        morador.autorizarVisitante();
        porteiro.registrarEntrada();

        Notificacao notificacao = new Notificacao("Visitante autorizado");
        notificacao.enviar();
    }
}