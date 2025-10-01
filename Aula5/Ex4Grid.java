package Aula5;
import java.util.Scanner;
public class Ex4Grid {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] num = new int[3][3];

        System.out.println("Vamos montar um grid 3x3!\n");
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
                System.out.print("Digite a " + i + "ª linha da " + j + "ª coluna: ");
                num [i][j]= ler.nextInt();
            }
        }
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }
        ler.close();
    }
}
