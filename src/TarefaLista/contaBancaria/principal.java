package TarefaLista.contaBancaria;

import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> banco = new ArrayList<>();

        ContaBancaria cb1 =  new ContaBancaria("Nome", 1000);
        ContaBancaria cb2 =  new ContaBancaria("ganhadior", 2500);
        ContaBancaria cb3 =  new ContaBancaria("infeliz" , 200);
        ContaBancaria cb4 =  new ContaBancaria("azarado", 2499.99);

        banco.add(new ContaBancaria("1234", 123));
        banco.add(new ContaBancaria("1324", 123.232));
        banco.add(new ContaBancaria("1414", 1200.57));



        banco.add(cb1);
        banco.add(cb2);
        banco.add(cb3);
        banco.add(cb4);

        ContaBancaria contaBancaria = null;
        double maiorSALDO = Double.MIN_VALUE;

        for (ContaBancaria item: banco){
            if (item.getSaldo() > maiorSALDO){
                maiorSALDO = item.getSaldo();
                contaBancaria = item;
            }
        }

        if (contaBancaria !=null){
            System.out.println("A conta com maior saldo é: ");
            System.out.println("Numero conta: " + contaBancaria.getConta());
            System.out.println("Com o saldo de  "+ contaBancaria.getSaldo());
        } else {
            System.out.println("NENHUMA CONTA ECNONTRADO");
        }
    }
}
