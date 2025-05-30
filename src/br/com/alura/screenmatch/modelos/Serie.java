package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosTemporadas;
    private int minutosEpisodio;

    public Serie(String nome, int anolancamento) {
        super(nome, anolancamento);
    }


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosTemporadas() {
        return episodiosTemporadas;
    }

    public void setEpisodiosTemporadas(int episodiosTemporadas) {
        this.episodiosTemporadas = episodiosTemporadas;
    }

    public int getMinutosEpisodio() {
        return minutosEpisodio;
    }

    public void setMinutosEpisodio(int minutosEpisodio) {
        this.minutosEpisodio = minutosEpisodio;
    }


    @Override
    public String toString() {
        return "serie: " + this.getNome() + "(" + this.getAnolancamento() +  ")";
    }
}
