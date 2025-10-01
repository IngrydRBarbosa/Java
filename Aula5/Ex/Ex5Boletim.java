package Aula5.Ex;
import javax.swing.JOptionPane;

public class Ex5Boletim {
    public static void main(String[] args) {
        double[][] boletim = new double[3][4];
        double[] medias = new double[3];
        double soma = 0;
        
        JOptionPane.showMessageDialog(null, "=========  BOLETIM ESCOLAR  ==========\nDigite a seguir as 4 notas bimestrais de cada aluno");
        for(int i = 0; i < boletim.length; i++){
            for(int j = 0; j < boletim[i].length; j++){
                boletim[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (j+1) + "ª nota do " + "aluno " + (i+1)));
                soma += boletim[i][j];
            }
            medias[i] = soma/boletim[i].length;
            soma = 0;
        }
        String resultadoFinal = "As médias dos alunos são:\n";
        for(int i = 0; i < boletim.length; i++) {
            resultadoFinal += "Aluno " + (i+1) + ": " + String.format("%.2f", medias[i]) + "\n";
        }
        JOptionPane.showMessageDialog(null, resultadoFinal);
    }
}
