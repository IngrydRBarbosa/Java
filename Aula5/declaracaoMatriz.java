package Aula5;

public class declaracaoMatriz {
    public static void main(String[] args) {
        int[][] tabela = {{1,2,3}, {3,4,5}, {4,5,6}};

        for(int linha = 0; linha < tabela.length; linha ++) {
            for(int coluna = 0; coluna < tabela[linha].length; coluna++){
                System.out.println(tabela[linha][coluna]+"\t");
            }
            System.out.println();
        }
    }
}
