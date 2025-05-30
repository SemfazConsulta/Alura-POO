package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("esta entre os favoritos");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("De uma chance");
        }
    }
}
