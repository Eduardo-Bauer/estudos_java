package java.metodos;

public class Metodos {
    public static void main(String[] args) {
        // funcoes ou sub-rotinas:

        /* criterios:
        * nomeado como verbo
        * letras minusculas com excecao da primeira letra da segunda palavra
        * apenas uma acao por metodo, responsabilidade unica
        * usar objetos para passar como parametros quando se necessita muitos parametros
        * */
    }
    public int somar(int n1, int n2){
        return n1 + n2;
    }

    public void abrirConexao(){
        //.................
    }

    public void concluirProcessamento(){
        //.................
    }

    // passagem de classe como parametro
    public void gravarCliente(/*Cliente cliente*/){
        //.................
    }

    // esse metodo as outras classes nao conseguem ver ele
    private void metodoPrivado(){
        //.................
    }

    // esse metodo corre um risco de disparar uma ecessao: throws Exception
    private double dividir(int dividendo, int divisor) throws Exception{
        return dividendo / divisor;
    }
}
