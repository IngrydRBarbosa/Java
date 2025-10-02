package Aula6.Ex;
import java.util.Scanner;

public class Aluno {
    String nome;
    int matricula;
    double nota;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno[] minhaTurma = new Aluno[3];
     
        for(int i = 0; i < minhaTurma.length; i++) {
         minhaTurma[i] = new Aluno();
         System.out.print("Digite o nome do aluno: ");
         minhaTurma[i].nome = sc.nextLine();
         System.out.print("Digite a matrícula do aluno: ");
         minhaTurma[i].matricula = sc.nextInt();
         System.out.print("Digite a nota do aluno: ");
         minhaTurma[i].nota = sc.nextDouble();
        }
        for(int i = 0; i < minhaTurma.length; i++) {
            System.out.println(minhaTurma[i]);
        }
    }
}
