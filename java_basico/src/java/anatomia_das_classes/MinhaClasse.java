package java.anatomia_das_classes;

public class MinhaClasse {
    public static void main(String[] args) {
        // printando na saida do sistema "teste de print".
        System.out.println("teste de print");

        // Variavel com o primeiro nome minusculo por ser modificada.
        String primeiroNome = "Eduardo";
        String segundoNome = "Bauer";
        String nomeCompleto = juncaoNomes(primeiroNome, segundoNome);
        int anoDeNascimento = 2021;
        double valorTotal;
        boolean simNao = true;

        // Variabel toda maiuscula é uma variavel constante.
        final String BR = "Brasil";
        double PI = 3.14;
        int ESTADOS_BRASILEIROS = 27;

        // Manipulacao das variaveis.
        anoDeNascimento = 2025;
        System.out.println(nomeCompleto);
    }

    // Metodos TipoRetorno NomeObjetoNoInfinitivo Parametro(s)
    public static int somar (int numero1, int numero2){
        return numero1 + numero2;
    }

    public static String juncaoNomes(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
