package TarefaOrdenacao.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Titulo> listaTitulos = new ArrayList<>();

        listaTitulos.add(new Titulo("Esquilos"));
        listaTitulos.add(new Titulo("Aves"));
        listaTitulos.add(new Titulo("Passarinho"));
        listaTitulos.add(new Titulo("Tubarão"));
        listaTitulos.add(new Titulo("AArara"));

        Collections.sort(listaTitulos);
        System.out.println("Ordenados: " + listaTitulos);
    }
}
