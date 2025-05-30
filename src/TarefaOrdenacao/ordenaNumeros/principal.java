package TarefaOrdenacao.ordenaNumeros;

import java.util.ArrayList;
import java.util.Comparator;

public class principal {
    public static void main(String[] args) {

        ArrayList<Numeros> listaNumeros = new ArrayList<>();

        listaNumeros.add(new Numeros(64));
        listaNumeros.add(new Numeros(26));
        listaNumeros.add(new Numeros(32));
        listaNumeros.add(new Numeros(52));

        listaNumeros.sort(Comparator.comparing(Numeros::getNumero));
        System.out.println(listaNumeros);

    }
}
