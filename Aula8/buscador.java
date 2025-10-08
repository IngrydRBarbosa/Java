package Aula8;

public class buscador {
    public static int buscaSequencial(int[] vetor, int valorProcurado) {
        // percore o vetor do início ao fim
        for(int i = 0; i < vetor.length; i++) {
            // se encontrar o valor
            if(vetor[i] == valorProcurado) {
                return i; // retorna a posição (índice) do item
            }
        }
        // se o loop terminar e não encontrar, retorna -1
        return -1;
    }

    // Na busca binária o vetor precisa estar ordenado em crescente ou decrescente (exemplo do dicionário)
    public static int buscaBinaria(int[] vetor, int busca) {
        int inicio = 0;
        int fim = vetor.length -1; // vetor começa no 0
        while(inicio <= fim) {
            int meio = inicio + (fim - inicio) /2;
            if(vetor[meio] == busca) {
                return meio; // retorna a posição do item
            }
            if(busca < vetor[meio]) {
                fim = meio -1;
            }else {
                inicio = meio +1;
            }
        }
        return -1;
    }
}
