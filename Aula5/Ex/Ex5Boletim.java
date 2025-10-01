package Aula5.Ex;
import javax.swing.JOptionPane;

public class Ex5Boletim {
    public static void main(String[] args) {
        double[][] boletim = new double[3][4];
        
        for(int i = 0; i < boletim.length; i++){
            for(int j = 0; j < boletim[i].length; j++){
                boletim[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (j+1) + "ª nota do " + (i+1) + "º aluno: "));
            }
        }
        String resultadoFinal = "As médias dos alunos é:\n";
        for(int i = 0; i < boletim.length; i++) {
            double soma = 0;
            for(int j = 0; j < boletim[i].length; j++) {
                soma += boletim[i][j];
            }
            double media = soma/boletim[i].length;
            resultadoFinal += "Aluno " + (i+1) + ": " + String.format("%.2f", media) + "\n";
        }
        JOptionPane.showMessageDialog(null, resultadoFinal);
    }
}
