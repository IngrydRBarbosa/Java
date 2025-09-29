package Aula5;

public class matrizes {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4]; // matriz 3x4 (3 linhas, 4 colunas) 
        matriz[0][0] = 15; // Acessa a primeira linha e primeira coluna 

        String[][] agenda = {
            {"José", "9999-9999"}, // linha 0 
            {"Maria", "9999-1111"} // linha 1 
        };

        System.out.println("Contato: " + agenda[0][0]);
        System.out.println("Contato: " + agenda[0][1]);
    }
}
