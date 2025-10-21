package Aula9.CalculaImposto;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar = "";

        do {

            System.out.print("Produto: ");
            String desc = sc.next();
            System.out.print("Valor: ");
            double valor = sc.nextDouble();
            System.out.print("Quantidade: ");
            int qtd = sc.nextInt();

            Produto produto = new Produto(desc, valor, qtd);

            System.out.printf("\nDescrição: %s\nValor: R$%.2f\nTotal: R$%.2f\nICMS: R$%.2f\n", produto.getDescricao(), produto.getValor(), produto.calculaTotal(), produto.calculaICMS());
            System.out.println("\nDeseja encerrar o programa? (S/N)");
            continuar = sc.next();

        } while (!continuar.equalsIgnoreCase("S"));
        sc.close();
    }
}
