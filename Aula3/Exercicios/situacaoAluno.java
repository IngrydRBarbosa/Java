package Aula3;

public class situacaoAluno {
    public static void main(String[] args) {
        int nota1 = 10, nota2 = 7;
        double media = (nota1+nota2)/2;

        if(media >= 7){
            System.out.println("Aprovado");
        }else if(media < 7){
            System.out.println("Reprovado");
        }else if(media == 10){
            System.out.println("Aprovado, parabens!");
        }
    }
}
