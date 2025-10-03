package Aula7.Ex.Ex1Livro;

public class Livro {
    String titulo;
    int anoPublicado;
    Autor autor;
    // mesmo nome da classe (livro)
    public Livro(String titulo, int anoPublicado, Autor autor){
        this.titulo = titulo;
        this.anoPublicado = anoPublicado;
        this.autor = autor;
    }
}
