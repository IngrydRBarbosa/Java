package Aula5;

public class vetor {
    public static void main(String[] args) {
        int[] numeros = new int[5]; // vetor com 5 posições, todas valendo 0
        String[] nomes = {"Ana", "Carlos", "Beatriz"}; // vetor com 3 posições já definidas
        
        //FOR -> Usado para controlar uma posição específica
        double soma = 0;
        for(int i=0; i<numeros.length; i++) { // lenght é o tamanho do vetor 
            soma += numeros[i];
        }

        //FOR EACH (for aprimorado) -> somando valores de todos os index de números. Usado para percorrer todos os elementos do vetor
        for(double numero : numeros) {
            soma += numero;
        }
    }
}
