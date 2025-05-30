package TarefaPrincipal;

public class Compras implements Comparable<Compras>{
    private String descricao;
    private double valor;

    public Compras(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compras: descricao= " + descricao +
                " valor = " + valor;
    }

    @Override
    public int compareTo(Compras o) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(o.valor));
    }
}
