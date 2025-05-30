package TarefaLista.tarefa4Produto;

import java.util.ArrayList;

public class PrincipalProduto {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos =  new ArrayList<>();

        Produto prod1 = new Produto("arroz", 22.99);
        Produto prod2 = new Produto("trigo", 11.99);
        Produto prod3 = new Produto("açucar", 2.99);
        listaProdutos.add(prod1);
        listaProdutos.add(prod2);
        listaProdutos.add(prod3);

        for (Produto item: listaProdutos){
            System.out.println("Produtos: " + item.getNome());
            double calculo =  item.getPreco() / listaProdutos.size();
            System.out.println("Calculo: " + calculo);

        }
    }
}
