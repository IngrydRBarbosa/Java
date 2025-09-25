package Aula4.Exercicios;

public class Ex3MediaNotas {
    const int notas = 5;
    public static void main(String[] args) {
        int notasValidas = 0;
        double mediaNotas = notasValidas/5;

        for(int i=0; i<=5; i++){
            if(i > 10){
                continue;
            } else if(i<0){
                break;
            }
        }
        System.out.println("A média das notas válidas é: " + mediaNotas);
    }
}
