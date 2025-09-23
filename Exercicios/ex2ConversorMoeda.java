package Exercicios;
public class ex2ConversorMoeda {
    public static void main(String[] args) {
        double valorEmDolar = 32;
        double taxaDeCambio = 5.25;
        double valorEmReal = valorEmDolar * taxaDeCambio;

        System.out.println("O valor em reais (R$) e: " + valorEmReal);
    }
}
