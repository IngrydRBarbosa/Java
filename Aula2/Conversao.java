package Aula2;

public class Conversao {
    public static void main(String[] args){
        int a = 100;
        float b = a;
        double c = 4.19;
        //int d = c; não pode converter assim
        int d = (int) c;
        float e = (float) c;
        /* todos os pontos flutuantes são double por padrão 
        para ser float precisa do f no final */
        float f = 6.18f;
        System.out.println(b + "\n" + c + "\n" + d + "\n" + e + "\n" + f);
    }

}
