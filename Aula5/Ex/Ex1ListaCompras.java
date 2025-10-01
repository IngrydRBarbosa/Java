package Aula5.Ex;
import java.util.Scanner;

public class Ex1ListaCompras {
    public static void main(String[] args) {
        String itens[] = new String[5];
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite abaixo sua lista de compras:");
        for(int i=0; i<itens.length; i++) {
            System.out.print(i+1 + ". ");
            itens[i] = ler.nextLine();
        }
        System.out.println("\n========== LISTA DE COMPRAS ==========");
        for(int i=1; i<itens.length; i++) {
            System.out.println(i + ". " + itens[i]);
        }
        ler.close();
    }
}
