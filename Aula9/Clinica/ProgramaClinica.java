package Aula9.Clinica;
import java.util.Scanner;

public class ProgramaClinica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medico medico1 = new Medico(12345, "Ana Maria", 0, 250);
        Medico medico2 = new Medico(45678, "Antonio", 0, 300);
        Medico medico3 = new Medico(8985, "Jose", 0, 350);
        double consulta;


        System.out.println("---- SISTEMA CLÍNICA ----");
        System.out.printf("Adicione o novo valor da consulta do médico %s: ", medico2.getNome());
        
            if(sc.hasNextDouble()){
                consulta = sc.nextDouble();
                medico2.setValorDaConsulta(consulta);
            } else {
                System.out.println("Entrada inválida");
            }


        medico1.pagamentoDinheiro(medico1.getValorDaConsulta());
        medico2.pagamentoPlano(medico2.getValorDaConsulta());
        medico3.pagamentoPlano(medico3.getValorDaConsulta());
    

        System.out.println("\nNome: " + medico1.getNome() + " \t\tSalario: " + medico1.getSalario());
        System.out.println("Nome: " + medico2.getNome() + " \t\tSalario: " + medico2.getSalario());
        System.out.printf("Nome: %d \t\tSalario: %.2f", medico3.getNome(), medico3.getSalario());
        System.out.println("Total de médicos cadastrados: " + Medico.getTotalMedicos());
        sc.close();
    }
}
