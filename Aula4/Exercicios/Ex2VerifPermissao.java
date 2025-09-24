package Aula4.Exercicios;

public class Ex2VerifPermissao {
    public static void main(String[] args) {
        float altura = 1.7f;
        boolean estaAcompanhada = false;

        if(altura >= 1.6 || estaAcompanhada) {
            System.out.println("Entrada autorizada! :D");
        } else{
            System.out.println("Entrada não permitida :(");
        }
    }
}
