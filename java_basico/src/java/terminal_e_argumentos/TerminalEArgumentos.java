package java.terminal_e_argumentos;

import java.util.Locale;
import java.util.Scanner;

/*
*public class TerminalEArgumentos {
*
*    public static void main(String[] args) {
*        System.out.println("Oi, fui executado pelo Terminal");
*    }
*}
**/

public class TerminalEArgumentos {
    public static void main(String[] args) {
        // Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "m");
    }
}
