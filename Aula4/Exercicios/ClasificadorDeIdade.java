package Aula4.Exercicios;

public class ClasificadorDeIdade {
    public static void main(String[] args) {
        int idade = 14;
    
        if(idade < 14){
            System.out.println("Essa idade se enquadra como criança");
        } else if(idade < 17){
            System.out.println("Essa idade se enquadra como adolescente");
        } else if(idade < 65){
            System.out.println("Essa idade se enquadra como adulto");
        } else{
            System.out.println("Essa idade se enquadra como idoso");
        }
    }
}
