package TarfeaExceptionm.tarefa1;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int i = num1.nextInt();
        System.out.print("Digite a divisão: ");
        int div = num1.nextInt();

        try {
            int divisao = i /div;
            System.out.println("Resultado da divisão: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Houve um erro na equação pois e 0");
        }
    }
}
