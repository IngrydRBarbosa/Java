package Aula7.Correios;

public class Programa {
    public static void main(String[] args) {
        // cria objeto endereço
        Endereco endDoJoao = new Endereco();
        endDoJoao.rua = "Rua das Flores";
        endDoJoao.numero = 123;
        endDoJoao.cep = "25680-000";
        endDoJoao.cidade = "Petrópolis";

        // cria o objeto pessoa
        Pessoa joao = new Pessoa();
        joao.nome = "João Carlos";
        joao.cpf = "111.222.333-44";

        // conecta os dois objetos
        joao.endereco = endDoJoao;

        // acessando dados através da composição
        System.out.println("O " + joao.nome + "mora na cidade de " + joao.endereco.cidade);
    }
}
