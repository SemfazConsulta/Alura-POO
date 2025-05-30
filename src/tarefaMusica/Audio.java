package tarefaMusica;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int curtidas;
    private int Classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }


    public int getClassificacao() {
        return Classificacao;
    }


    public void cuitir(){
        this.curtidas++;
    }

    public void reproduzir(){
        this.totalReproducoes++;
    }
    public void capa(){
        System.out.println("Nome musica: " + getTitulo());
        System.out.println("Total de Reproduções :" + getTotalReproducoes());
        System.out.println("Total Curtidas: " + getCurtidas());
        System.out.println("Classificação: " + getClassificacao());

    }
}
