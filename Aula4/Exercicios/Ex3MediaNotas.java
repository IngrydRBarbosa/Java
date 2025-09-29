package Aula4.Exercicios;
import java.util.Scanner;

public class Ex3MediaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        double notas;
        double notasValidas = 0;
        double mediaNotas;

        for(int i=1; i<=5; i++){
            System.out.printf("Digite a %dº nota: ", i);
            notas = scanner.nextInt();
            if(notas > 10){
                continue;
            } else if(notas<0){
                break;
            }
            notasValidas += notas;
            cont++;
        }

        mediaNotas=notasValidas/cont;
        System.out.println("A média das notas válidas é: " + mediaNotas);
        scanner.close();
    }
}
