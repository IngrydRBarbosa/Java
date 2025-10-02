package Aula6;


    public class Aluno {
        // atributos (os campos do registro)
        String nome;
        int matricula;
        double notaFinal;
        public static void main(String[] args) {
            Aluno aluno1 = new Aluno();
            // Preenchendo os dados do registro
            aluno1.nome = "Carlos Pereira";
            aluno1.matricula = 201;
            aluno1.notaFinal = 7.5;
            // Acessando os dados
            System.out.println("Matrícula do aluno: " + aluno1.matricula);
        }
    }
