/* Escopo:
* É o ambiente onde uma variavel pode ser acessada.
* Em java, o escopo de variáveis vai de acordo com o bloco onde ela foi declarada.
* Variavel dentro de um metodo, apenas o metodo consegue ver ela.
* */

package java.escopo;

public class Escopo {
    public static void main(String[] args) {
        double valorParcela = 10;
    }

    public void aumentarParcela(double valorParcela){
        double novaParcela = valorParcela * 10;
    }
    // desse jeito nao tenho acesso a variavel novaParcela.
}
