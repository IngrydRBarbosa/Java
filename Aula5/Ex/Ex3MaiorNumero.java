package Aula5.Ex;
import javax.swing.JOptionPane;

public class Ex3MaiorNumero {
    public static void main(String[] args) {
        int maiorPont = 0;
        
        System.out.println("Digite suas últimas 6 pontuações:");
        for(int i=1; i<=6; i++) {
            String pont = JOptionPane.showInputDialog(i + "ª pontuação: ");
            int pontuacao = Integer.parseInt(pont);
            if(pontuacao > maiorPont){
                maiorPont = pontuacao;
            }
        }
        JOptionPane.showMessageDialog(null, "A sua maior pontuação foi: " + maiorPont);
    }
}
