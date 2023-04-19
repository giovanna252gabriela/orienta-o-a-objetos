package br.com.questao02;

import static br.com.questao02.Publicacao.visualizarDetalhes;

public class Encontrar {
    public static void main(String[] args) {
        AchadoPerdido ap = new AchadoPerdido();
        ap.setTitulo(" caderno ");
        ap.setDescricao(" capa dura ");
        ap.setFoto(" sem foto ");
        ap.setTipo(" 10 matérias ");
        ap.setLocalAchado(" escola ");
        ap.setDataHora(" 03/02/2023 às 13:40");
        ap.setStatus(" encontrado ");

        System.out.println( "Digite os dados do item: ");
        System.out.println(" Detalhes : " );

    }
}