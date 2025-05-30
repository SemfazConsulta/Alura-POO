package TarefaOrdenacao.Titulo;

public class Titulo implements Comparable<Titulo>{
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public Titulo(String tipo) {
        this.tipo = tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getTipo().compareTo(outroTitulo.getTipo());
    }

    @Override
    public String toString() {
        return tipo;
    }
}
