package br.com.minhaempresa.screenmatch.calculos;

import java.sql.SQLOutput;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Coloque na lista para assistir depois ;)");
        }

    }
}