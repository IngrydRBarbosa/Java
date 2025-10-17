package Aula8.Ordenadores.BuscaObjeto;

public class buscaObjeto {
    public static void selectionSortPorNome(item[] vetor) {
        int n = vetor.length;
        for(int i = 0; i < n-1; i++) {
            int indiceDoMenor = i;
            for(int j = i+1; j < n; j++) {
                if(vetor[j].nome.compareToIgnoreCase(vetor[indiceDoMenor].nome) < 0) { //compareToIgnoreCase compara duas coisas e ignora se a palavra está em minúsculo ou maiúsculo
                    indiceDoMenor = j;
                }
            }
            item temp = vetor[indiceDoMenor];
            vetor[indiceDoMenor] = vetor[i];
            vetor[i] = temp;
        }
    }

    public static item buscaBinariaPorNome(item[] vetor, String busca) {
        int inicio = 0;
        int fim = vetor.length -1;
        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) /2;
            int comparacao = busca.compareToIgnoreCase(vetor[meio].nome);
            if(comparacao == 0) {
                return vetor[meio];
            }
            if(comparacao < 0) {
                fim = meio -1;
            }else {
                inicio = meio +1;
            }
        }
        return null;
    }
}
