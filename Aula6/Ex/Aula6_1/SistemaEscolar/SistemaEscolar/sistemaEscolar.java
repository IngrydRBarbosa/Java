package Aula6.Ex.Aula6_1.SistemaEscolar.SistemaEscolar;
import java.util.Scanner;

public class sistemaEscolar {
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
            turma[i].mostrarDados(i+1);
            turma[i].verificarAprovacao();
        }
        sc.close();
    }
}
