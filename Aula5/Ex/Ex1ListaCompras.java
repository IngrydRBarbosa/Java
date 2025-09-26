package Aula5.Ex;
import java.util.Scanner;

public class Ex1ListaCompras {
    public static void main(String[] args) {
        String itens[] = new String[5];
        Scanner ler = new Scanner(System.in);

        System.out.println("========== LISTA DE COMPRAS ==========");
        for(int i=1; i<=5; i++) {
            System.out.println(i + ". ");
            itens[i] = ler.nextLine();
        }
        System.out.println("========== LISTA DE COMPRAS ==========");
        System.out.println(itens[]);
    }
}
