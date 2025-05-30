package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Chefão",1942);
        meuFilme.setDuracaoMinutos(190);

        System.out.println(meuFilme.getNome());
        System.out.println(meuFilme.getAnolancamento());

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getSomaAvaliacao());
        System.out.println(meuFilme.getTotalAvaliacao());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost",2000);
        lost.exibiFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosTemporadas(10);

        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.setDuracaoMinutos(200);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmePaulo =  new Filme("DogVille",2003);
        filmePaulo.setDuracaoMinutos(200);
        filmePaulo.avalia(10);

        ArrayList<Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(filmePaulo);
        listaDeFilme.add(meuFilme);
        listaDeFilme.add(outroFilme);

        System.out.println("Tamnho lista: " + listaDeFilme.size());
        System.out.println("Primeiro filme: " + listaDeFilme.get(0).getNome());
        System.out.println(listaDeFilme);
        System.out.println("ToString do Filme: " + listaDeFilme.get(0).toString());

    }
}
