package java.controle_de_fluxo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryECatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite a sua idade");
        try{
            int idade = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("digite apenas numeros");
        }
    }
}
