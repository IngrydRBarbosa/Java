package Exercicios;
public class ex3DivisaoComResto {
    public static void main(String[] args){
        int totalDeItens = 17, capacidadeDaCaixa = 5;
        int caixasPreenchidas = totalDeItens/capacidadeDaCaixa, sobras = totalDeItens%capacidadeDaCaixa;

        System.out.println("Serao preenchidas " + caixasPreenchidas + " caixas\nSobrarao " + sobras + " itens.");
    }
}
