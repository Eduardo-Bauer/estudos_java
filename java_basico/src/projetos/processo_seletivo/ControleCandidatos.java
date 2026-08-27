package projetos.processo_seletivo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ControleCandidatos {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");

        String [] candidatos = {"Felipe", "Marcia", "Paulo", "Augusto", "Monica", "Eduardo"};
        for(String candidato: candidatos){
            entrarEmContato(candidato);
        }
    }

    static  void imprimirCandidatosSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Paulo", "Augusto", "Monica", "Eduardo"};
        for(String candidato: candidatos){
            System.out.printf("Candidato selecionado: %s\n", candidato);
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void selecionarCancidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Paulo", "Augusto", "Monica", "Eduardo"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual++];

            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + "solicitou " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("Candidato selecionado");
                candidatosSelecionados++;
            }
        }
    }

    // metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void entrarEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso");
            }

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato");
        }else{
            System.out.println("Contato nao realizado");
        }
    }

    static void analizarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");

        } else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");

        }else{
            System.out.println("Aguardar demais candidatos");
        }
    }
}
