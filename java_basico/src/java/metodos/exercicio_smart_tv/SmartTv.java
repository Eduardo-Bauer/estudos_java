package java.metodos.exercicio_smart_tv;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 50;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume++;
    }

    public void trocarCanal(int novoCanal){
        canal = novoCanal;
    }
}
