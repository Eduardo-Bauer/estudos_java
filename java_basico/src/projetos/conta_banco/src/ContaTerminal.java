package projetos.conta_banco.src;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        int numeroConta = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        saldo = scanner.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.%n",
                nomeCliente, agencia, numeroConta, saldo
        );

        scanner.close();
    }
}