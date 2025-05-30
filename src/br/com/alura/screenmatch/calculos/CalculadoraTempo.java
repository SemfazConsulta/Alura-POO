package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t){
        System.out.println("Adionando duração em minutos de " + t);
        tempoTotal += t.getDuracaoMinutos();
    }


}
