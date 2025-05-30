package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.exececao.ErroConversaoExcption;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anolancamento;
    private boolean incluidoPlano;
    private double somaAvaliacao;
    private int totalAvaliacao;
    private int duracaoMinutos;

    public Titulo(String nome, int anolancamento) {
        this.nome = nome;
        this.anolancamento = anolancamento;
    }

    public Titulo(TituloOmdb meuTituloOmd) {
        this.nome = meuTituloOmd.title();
        if (meuTituloOmd.year().length() > 4){
            throw new ErroConversaoExcption("Não consegui converter o ano tem mais de 4 caracters!!!");
        }
        this.anolancamento = Integer.valueOf(meuTituloOmd.year());
        this.duracaoMinutos = Integer.valueOf(meuTituloOmd.runtime().substring(0,3));
    }

    public void  exibiFichaTecnica(){
        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano: " + anolancamento);
    }

    public void avalia(double nota){
        somaAvaliacao += nota;
        totalAvaliacao++;
    }

    public double pegaMedia(){
        return somaAvaliacao / totalAvaliacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnolancamento() {
        return anolancamento;
    }

    public void setAnolancamento(int anolancamento) {
        this.anolancamento = anolancamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public double getSomaAvaliacao() {
        return somaAvaliacao;
    }

    public void setSomaAvaliacao(double somaAvaliacao) {
        this.somaAvaliacao = somaAvaliacao;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnolancamento() + ") Duração em minutos: " +  this.getDuracaoMinutos() ;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome()); // compara um titulo com outro titulo para fazer a ordenação
    }

}
