package Aula6.Ex.Aula6_1.SistemaEscolar.SistemaEscolar;

public class Aluno {
    String nome;
    int matricula;
    double nota;
    // void é o método do objeto Aluno (como a função no portugol retornando vazio (void))
    void verificarAprovacao(){
        if(nota >= 7) {
            System.out.println(nome + "está APROVADO(A)!");
        } else {
            System.out.println(nome + "está em RECUPERAÇÃO.");
        }
    }
    void mostrarDados(int num){
        System.out.printf("\n---------- DADOS DO ALUNO %d ----------\n", num);
        System.out.printf("Nome: %s\nMatrícula: %d\nNota: %.2f\n", nome, matricula, nota);
    }
}
