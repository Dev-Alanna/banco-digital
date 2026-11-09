import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
            scanner.next();
            System.out.print(mensagem);
        }
        return scanner.nextInt();
    }

    static double lerDecimal(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Digite um número.");
            scanner.next();
            System.out.print(mensagem);
        }
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        Conta conta = new Conta("Maria", 1001);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println();
            System.out.println("=== BANCO DIGITAL ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");
            opcao = lerInteiro("Escolha uma opção: ");

            if (opcao == 1) {
                double valor = lerDecimal("Valor do depósito: ");
                if (conta.depositar(valor)) {
                    System.out.println("Depósito realizado!");
                } else {
                    System.out.println("Depósito não permitido.");
                }
            } else if (opcao == 2) {
                double valor = lerDecimal("Valor do saque: ");
                if (conta.sacar(valor)) {
                    System.out.println("Saque realizado!");
                } else {
                    System.out.println("Saque não permitido.");
                }
            } else if (opcao == 3) {
                System.out.println("Saldo: " + conta.getSaldo());
            } else if (opcao == 4) {
                System.out.println("Até logo!");
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}