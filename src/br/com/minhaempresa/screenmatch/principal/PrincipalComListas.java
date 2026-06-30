package br.com.minhaempresa.screenmatch.principal;

import br.com.minhaempresa.screenmatch.modelos.Filme;
import br.com.minhaempresa.screenmatch.modelos.Serie;
import br.com.minhaempresa.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme favorito = new Filme("O poderoso chefão", 1970);
        favorito.avalia(9);
        Filme outro = new Filme("Avatar", 2023);
        outro.avalia(6);
        var filmeDoMateus = new Filme("Hokum", 2026);
        filmeDoMateus.avalia(10);
        Serie serie = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoMateus);
        lista.add(outro);
        lista.add(favorito);
        lista.add(serie);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());

            }

        }

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Adam");
        buscaPorArtistas.add("Shirll");
        buscaPorArtistas.add("Mary");
        System.out.println(buscaPorArtistas);

        Collections.sort(buscaPorArtistas);
        System.out.println("Lista da ordenação");
        System.out.println(buscaPorArtistas);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenação por ano");
        System.out.println(lista);


    }
}
