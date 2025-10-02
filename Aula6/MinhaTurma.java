package Aula6;

public class MinhaTurma {
    String nome;
    int matricula;
    public static void main(String[] args) {
        // vetor que guarda 30 registros
        MinhaTurma[] aluno = new MinhaTurma[30];

        // preenchendo o vetor que até então estava vazio
        aluno[0] = new MinhaTurma();
        aluno[0].nome = "Juliana Lima";
        aluno[0].matricula = 202;
    }
}
