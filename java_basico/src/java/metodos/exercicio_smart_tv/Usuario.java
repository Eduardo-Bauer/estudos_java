// criar um exemplo de uma classe para representar uma smartTV.

package java.metodos.exercicio_smart_tv;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("ligado? " + smartTv.ligada);
        System.out.println("canal atual: " + smartTv.canal);
        System.out.println("volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("ligado? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("ligado? " + smartTv.ligada);

        smartTv.trocarCanal(10);
        System.out.println("canal atual: " + smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("volume atual: " + smartTv.volume);
    }
}
