package Aula7.Escola;

public class Escola {
    String nomeDoCurso;
    Aluno[] alunosMatriculados;
    int vagasOcupadas;

    public Escola(String nomeDoCurso, int totalVagas){
        this.nomeDoCurso = nomeDoCurso;
        this.alunosMatriculados = new Aluno[totalVagas];
    }

    public void matricular(Aluno novoAluno){
        if(vagasOcupadas < alunosMatriculados.length){
            alunosMatriculados[vagasOcupadas] = novoAluno;
            vagasOcupadas++;
            System.out.println("Matrícula de " + novoAluno.nome + " realizada!");
        } else{
            System.out.println("Não há vagas disponíveis!");
        }
    }
}
