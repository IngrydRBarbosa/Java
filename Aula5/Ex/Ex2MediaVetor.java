package Aula5.Ex;
import java.util.Scanner;
public class Ex2MediaVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double notas[] = new double[4], soma = 0, mediaNotas;
    
        System.out.println("Digite as suas 4 notas bimestrais: ");
        for(double nota : notas) {
            System.out.print("Nota: ");
            nota = ler.nextDouble();
            soma += nota;
        } 
        mediaNotas = soma/notas.length;
        System.out.println("A média final é: " + mediaNotas);
        ler.close();
    }
}
