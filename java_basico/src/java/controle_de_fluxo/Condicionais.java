package java.controle_de_fluxo;

public class Condicionais {
    public static void main(String[] args) {
        int nota = 8;

        // condicional composta
        if (nota >= 7)
            System.out.println("Aprovado");

        else
            System.out.println("Reprovado");

        // condicional ternária
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }

    // condicional encadeada
    public void analizarNota(int nota){
        if (nota >= 7)
            System.out.println("Aprovado");

        else if (nota > 5 && nota < 7)
            System.out.println("Recuperacao");

        else
            System.out.println("Reprovado");
    }

    // swith case
    public void ReprovarAprovar(int nota){
        switch (nota){
            case 0, 1, 2, 3, 4, 5, 6: {
                System.out.println("Reprovado");
                break;
            }
            case 7, 8, 9, 10: {
                System.out.println("Aprovado");
                break;
            }
            default:
                System.out.println("Nota invalida");
        }
    }
}
