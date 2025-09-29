package Aula4.Exercicios;

public class Ex5ContadorParImpar {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++){
            if(i%2 == 0){
                System.out.printf("O número %d é par \n", i);
            }else {
                System.out.printf("O número %d é ímpar \n", i);
            }
        }
    }
}
