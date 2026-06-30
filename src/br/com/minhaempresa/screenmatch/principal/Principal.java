package br.com.minhaempresa.screenmatch.principal;

import br.com.minhaempresa.screenmatch.calculos.CalculadoraDeTempo;
import br.com.minhaempresa.screenmatch.calculos.FiltroRecomendacao;
import br.com.minhaempresa.screenmatch.modelos.Episodio;
import br.com.minhaempresa.screenmatch.modelos.Filme;
import br.com.minhaempresa.screenmatch.modelos.Serie;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme("O poderoso chefão", 1970);
        favorito.setDuracaoEmMinutos(180);

        Filme outro = new Filme("Avatar", 2023);
        outro.setDuracaoEmMinutos(200);

        Serie serie = new Serie("Lost", 2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + serie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);
        System.out.println("Tempo total: " + calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(outro);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoMateus = new Filme("Hokum", 2026);
        filmeDoMateus.setDuracaoEmMinutos(200);
        filmeDoMateus.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoMateus);
        listaDeFilmes.add(outro);
        listaDeFilmes.add(favorito);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(outro);

    }
}