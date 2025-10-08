package Aula8;

public class ProgramaBuscador {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6,7};
        int busca = 7;
        int posicao = buscador.buscaBinaria(vetor, busca);
        if(posicao == -1) {
            System.out.println("O número não está na lista.");
        }else {
            System.out.printf("O item buscado está na posição: %d e é o item: %d", posicao, vetor[posicao]);
        }
    }
}
