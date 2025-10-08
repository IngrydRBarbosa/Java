package Aula8.Ordenadores;

public class Ordenador {
    // Bubble sort: o mais didático. Compara os números de dois em dois e "sobe"/flutua para a direita o maior número em cada comparação até o maior ficar no final

     public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for(int i = 0; i < n - 1; i++) {
            System.out.printf("Posição i: %d \n", i);
            for(int j = 0; j < n -i-1; j++) {
                // -1 para comparar só até a penúltima posição, pois ele sempre compara com o número da frente então se fosse até a última posição não teria outro número a ser comparado
                System.out.printf("         ------- Trocou --------\nItem na posição %d é %d e item na posição %d é %d \n", j, vetor[j], j+1, vetor[j+1]);
                if(vetor[j] > vetor[j+1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
    }

    // Selection sort: É como ordenar as pessoas do menor para o maior para tirar uma foto. Escolhemos a menor e colocamos na primeira posição e assim por diante
    public static void SelectionSort(int[] vetor) {
        int n = vetor.length; // define "n" como o tamanho do vetor
        for(int i = 0; i < n -1; i ++) {
            System.out.printf("Posição i: %d \n", i);
            int indiceDoMenor = i;
            for(int j = i +1; j < n; j++) {
                if(vetor[j] < vetor[indiceDoMenor]) {
                    System.out.printf("O número selecionado (j) é o %d - %d número no indiceDoMenor é %d - %d \n", j, vetor[j], indiceDoMenor, vetor[indiceDoMenor]);
                    indiceDoMenor = j;
                }
            }
            int temp = vetor[indiceDoMenor];
            vetor[indiceDoMenor] = vetor[i];
            vetor[i] = temp;
            System.out.printf("temp %d - vetor[indiceDoMenor] %d - vetor[i] %d\n\n", temp, vetor[indiceDoMenor], vetor[i]);
        }
    }
}
