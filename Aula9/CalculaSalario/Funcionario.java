package Aula9.CalculaSalario;
public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularINSS() {
        // 11% do salário
        return salario * 0.11;
    }

    public double calcularVT() {
        // 6% do salário
        return salario * 0.06;
    }

    public double salarioLiquido() {
        // salário - descontos (INSS e VT)
        double inss = calcularINSS(); // armazena valor do desconto
        double valeTransp = calcularVT();
        return salario - inss -valeTransp;
    }
}
