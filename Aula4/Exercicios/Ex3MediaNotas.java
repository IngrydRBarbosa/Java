package Aula4.Exercicios;
import java.util.Scanner;

public class Ex3MediaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10, cont = 0;
        int notas[] = new int[n];
        int notasValidas = 0;
        double mediaNotas;

        for(int i=0; i<=n; i++){
            while(cont != 5 & notasValidas != 5){
                System.out.print("Digite sua nota: ");
                notas[i] = scanner.nextInt();
                if(i > 10){
                    continue;
                } else if(i<0){
                    break;
                }
                notasValidas += notas[i];
                cont++;
            }
        }
        mediaNotas=notasValidas/cont;
        System.out.println("A média das notas válidas é: " + mediaNotas);
        scanner.close();
    }
}
