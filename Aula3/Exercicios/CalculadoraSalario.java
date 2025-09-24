package Aula3.Exercicios;

public class CalculadoraSalario {
    public static void main(String[] args) {
        String nome = "Ingryd";
        float salario = 1690f;

        if(salario <= 1751.81){
            System.out.println(nome + ", seu salario com desconto do INSS e R$" + (salario * 0.92)); // mesma coisa que salario - (salario * 8/100) //
        }else if(salario <= 2919.72){
            System.out.println(nome + ", seu salario com desconto do INSS e R$" + (salario * 0.91)); // mesma coisa que salario - (salario * 9/100) //
        }else if(salario <= 5839.45){
            System.out.println(nome + ", seu salario com desconto do INSS e R$" + (salario * 0.9)); // mesma coisa que salario - (salario * 10/100) //
        }else if(salario > 5839.456){
            System.out.println(nome + ", seu salario com desconto do INSS e R$" + (salario * 0.89)); // mesma coisa que salario - (salario * 11/100) //
        }
    }
}
