package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Chefão",1942);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(6);
        var filmePaulo =  new Filme("DogVille",2003);
        outroFilme.avalia(10);
        Serie lost = new Serie("Lost",2000);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmePaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        ArrayList<String> buscaArtista = new ArrayList<>();
        buscaArtista.add("Adam sandler");
        buscaArtista.add("paulo");
        buscaArtista.add("jaceline");
        System.out.println(buscaArtista);

        Collections.sort(buscaArtista);
        System.out.println("Depois da ordenação: " +  buscaArtista);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnolancamento));
        System.out.println("Ordenado por ano: " + lista);
    }
}
