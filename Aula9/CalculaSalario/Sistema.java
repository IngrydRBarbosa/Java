package Aula9.CalculaSalario;
public class Sistema {
    public static void main(String[] args) {
        Funcionario jose = new Funcionario("José da Silva", 5000);
    
        System.out.println("------- DEMONSTRATIVO DE PAGAMENTO -------");
        System.out.printf("Nome: %s\nSalário bruto: %.2f\nINSS: %.2f\nVale transporte: %.2f\nSalário líquido: %.2f", jose.getNome(), jose.getSalario(), jose.calcularINSS(), jose.calcularVT(), jose.salarioLiquido());
    }
}
