package Aula4.Exercicios;

public class Ex4VerifDiaDaSemana {
    public static void main(String[] args) {
        byte diaDaSemana = 4;

        switch (diaDaSemana) {
            case 1, 7:
                System.out.println("É final de semana! :D");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Estamos em dia útil :(");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
}
