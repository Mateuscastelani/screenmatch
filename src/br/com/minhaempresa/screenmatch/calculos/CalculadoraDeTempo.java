package br.com.minhaempresa.screenmatch.calculos;

import br.com.minhaempresa.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();

    }

    public int getTempoTotal(){
        return this.tempoTotal;
    }


}
