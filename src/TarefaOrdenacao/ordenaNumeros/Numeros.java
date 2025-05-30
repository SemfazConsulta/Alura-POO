package TarefaOrdenacao.ordenaNumeros;

public class Numeros {
    private int numero;

    public Numeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.valueOf(numero);
    }
}
