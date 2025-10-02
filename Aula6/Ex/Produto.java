package Aula6.Ex;
import java.util.Scanner;

public class Produto {
    String nome;
    int codigo;
    double preco;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto1 = new Produto();
        System.out.print("Digite o nome do produto: ");
        produto1.nome = sc.nextLine();
        System.out.print("Digite o código do produto: ");
        produto1.codigo = sc.nextInt();
        System.out.print("Digite o preço do produto: ");
        produto1.preco = sc.nextDouble();
        
        System.out.println("\n--------- FICHA DO PRODUTO ---------");
        System.out.printf("Nome: %s \nCódigo: %s \nPreço: R$%s", produto1.nome, produto1.codigo, produto1.preco);
        sc.close();
    }
}
