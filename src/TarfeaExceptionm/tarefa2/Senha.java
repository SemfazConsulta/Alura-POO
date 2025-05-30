package TarfeaExceptionm.tarefa2;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha");
        String senha = scanner.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha cadastrada com sucesso: " + senha);
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

        private static void validarSenha(String senha) {
            if (senha.length() < 8) {
                throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracters");
            }
        }
    }

