package Aula10.Ex.DesfazCadastro;
import javax.swing.JOptionPane;
import Aula10.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana", 25);
        Pessoa p2 = new Pessoa("Bruno", 65);
        Pessoa p3 = new Pessoa("Carla", 40);

        PilhaCadastro pilha = new PilhaCadastro(5);

        pilha.push(p1);
        pilha.push(p2);
        pilha.push(p3);
        JOptionPane.showMessageDialog(null, "'PILHA' DOS CADASTROS:\n3. " + p3.getNome() + "\n2. " + p2.getNome() + "\n1. " + p1.getNome());
        pilha.pop();
        pilha.pop();
    }
}
