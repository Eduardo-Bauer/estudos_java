package projetos.desafio_controle_fluxo;

import java.util.Locale;
import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite o primeiro valor:");
        int parametroUm = scanner.nextInt();

        System.out.println("digite o segundo valor:");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception){
            System.out.println("O segundo parametro dever ser maior que o primerio");
        }
        scanner.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for(int i = 1; i <= contagem; i++){
            System.out.println(i);
        }
    }
}

