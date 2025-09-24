package Aula3.Exercicios;

public class situacaoAluno {
    public static void main(String[] args) {
        double nota1 = 5, nota2 = 7;
        double media = (nota1+nota2)/2;

        if(media == 10){
            System.out.println("Sua média foi: " + media + "\nAprovado, parabens!"); //melhor colocar o caso mais específico sempre em primeiro e ir em ordem decrescente//
        }
        else if(media >= 7){
            System.out.println("Sua média foi: " + media + "\nAprovado!");
        }else {
            System.out.println("Sua média foi: " + media + "\nReprovado!");
        }
    }
}
