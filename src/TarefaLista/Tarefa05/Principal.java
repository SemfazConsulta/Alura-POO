package TarefaLista.Tarefa05;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Forma> formas =  new ArrayList<>();

       formas.add(new Circulo(5.0));
       formas.add(new Quadrado(18.0));
       formas.add(new Circulo(3.7));
       formas.add(new Quadrado(21.0));

        for (Forma forma: formas){
            System.out.println(forma + "Tem area: " + forma.calcularArea());
        }
    }
}
