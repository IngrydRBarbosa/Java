package Aula4.Exercicios;

public class Ex4ContagemRegressiva {
    public static void main(String[] args) {
        int inicio = 10;
    
        while(inicio >= 2){
            System.out.print(inicio + ", ");
            inicio--;
            while(inicio == 1){
                System.out.print("1.");
                break;
            }
        }
    }
}
