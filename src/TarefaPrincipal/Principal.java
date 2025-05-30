package TarefaPrincipal;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartao: ");
        double limite = leitura.nextDouble();
        CartaoCredito cartao = new CartaoCredito(limite);

        int sair = 1;
        while (sair != 0){
            System.out.println("Digite a descrição da campra");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra");
            double valor = leitura.nextDouble();

            Compras compras =  new Compras(valor, descricao);
            boolean compraRealizada = cartao.lancaCompra(compras);

            if (compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo Insuficiente");
                sair = 0;
            }
        }
        System.out.println("************************");
        System.out.println("COMPRAS REALIZADAS");
        Collections.sort(cartao.getCompras());

        for (Compras c : cartao.getCompras()){
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }
        System.out.println("\n***********************************");

        System.out.println("\n SALDO DO CARTÃO: " + cartao.getSaldo());
    }
}
