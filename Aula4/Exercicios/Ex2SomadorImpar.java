package Aula4.Exercicios;

public class Ex2SomadorImpar {
    public static void main(String[] args) {
        int num = 1, soma = 0;

        for(int i=0; i<=100; i++){
            if(i%2 != 0){
                soma = soma + i;
            }
        }
        System.out.println("A soma dos números ímpares é: " + soma);
    }
}
