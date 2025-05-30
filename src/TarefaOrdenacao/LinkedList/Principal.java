package TarefaOrdenacao.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Elemento 1");
        list.add("Elemento 2");

        List<String> listaLinked = new LinkedList<>();
        listaLinked.add("Elemento A");
        listaLinked.add("Elemento B");

        System.out.println("ArrayList: " + list);
        System.out.println("LinkedLis: " + listaLinked);
    }
}
