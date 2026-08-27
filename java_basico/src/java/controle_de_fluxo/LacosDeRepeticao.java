package java.controle_de_fluxo;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        // laco for
        for(int i = 0; i < 10; i++){
            System.out.println(i + 1);
        }
        System.out.println("Laco acabou");

        // laco for com srray
        String alunos[] = {"Felipe", "Eduardo", "Marcos"};

        for(int i = 0; i< alunos.length; i++){
            System.out.println(alunos[i]);
        }
        // mais correto
        for(String aluno: alunos){
            System.out.println(aluno);
        }
        System.out.println("Laco acabou");

        // break e continue
        for(int i = 0; i< 10; i++){
            if(i == 5)
                break;
            else if (i == 3)
                continue;

            else
                System.out.println(i);
        }
        System.out.println("Laco acabou");

        // while
        int i = 50;
        while(i > 0){
            System.out.println(i--);
        }
        System.out.println("Laco acabou");

        // do while
        i = 50;
        do{
            System.out.println(i--);
        }while(i > 0);
        System.out.println("Laco acabou");
    }
}
