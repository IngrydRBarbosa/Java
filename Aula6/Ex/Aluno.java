package Aula6.Ex;
import java.util.Scanner;

public class Aluno {
    String nome;
    int matricula;
    double nota;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno[] turma = new Aluno[3];
     
        for(int i = 0; i < turma.length; i++) {
         turma[i] = new Aluno();
         System.out.printf("Digite o nome do %dº aluno: ", i+1);
         turma[i].nome = sc.next();
         System.out.printf("Digite a matrícula do %dº aluno: ", i+1);
         turma[i].matricula = sc.nextInt();
         System.out.printf("Digite a nota do %dº aluno: ", i+1);
         turma[i].nota = sc.nextDouble();
        }

        for(int i = 0; i < turma.length; i++) {
            System.out.printf("\n---------- DADOS DO ALUNO %d ----------\n", i+1);
            System.out.printf("Nome: %s\nMatrícula: %d\nNota: %.2f\n", turma[i].nome, turma[i].matricula, turma[i].nota);
        }
        sc.close();
    }
}
