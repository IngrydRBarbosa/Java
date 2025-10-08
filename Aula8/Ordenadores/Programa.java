package Aula8.Ordenadores;

// versão mais simples definindo os números
public class Programa {
    public static void main(String[] args) {
        int[] vetor = {30,18,55,77,2,5};
        
        Ordenador.bubbleSort(vetor);
        
        System.out.println("\nPosições ordenadas:");
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d -> %d\n", i, vetor[i]);
        }
    }
}

/* versão mais completa com o Random gerando números aleatórios
import java.util.Random;
public class ProgramaOrdenador {
    public static void main(String[] args) {
        int tamanhoVetor = 20;
        int[] vetor = new int[tamanhoVetor];
        Random gerador = new Random();
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(1000) +1;
        }

        ordenador.bubbleSort(vetor);

        System.out.println("\nPosições ordenadas:");
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d -> %d\n", i, vetor[i]);
        }
    }
}
*/
