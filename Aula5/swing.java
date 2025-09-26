package Aula5;
import javax.swing.JOptionPane;

public class swing {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Entre com a primeira nota");
        String n2 = JOptionPane.showInputDialog("Entre com a segunda nota");
        double nota1 = Double.parseDouble(n1);
        double nota2 = Double.parseDouble(n2);

        JOptionPane.showMessageDialog(null, "A média das notas é: "+ (nota1 + nota2)/2);
    }
}
