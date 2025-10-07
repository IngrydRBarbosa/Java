package Aula7.Ex.Livro;

public class ProgramaBiblioteca {
    public static void main(String[] args) {
        Autor Colleen = new Autor("Colleen Hoover", "americana");

        Livro VeraoTerminar = new Livro("Até o verão terminar", 2024, Colleen);

        System.out.printf("A autora %s é conhecida pelo livro %s, publicado em %d", VeraoTerminar.autor.nome, VeraoTerminar.titulo, VeraoTerminar.anoPublicado);
    }
}
