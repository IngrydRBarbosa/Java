package Aula10.Ex;

import Aula10.Pessoa;
import Aula10.Fila.Fila;

public class FilaVacinacao {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ingryd", 25);
        Pessoa p2 = new Pessoa("Dirceu", 65);
        Pessoa p3 = new Pessoa("Paula", 40);
        Pessoa p4 = new Pessoa("Ana", 30);
        Pessoa p5 = new Pessoa("Solange", 70);
        
        System.out.println("\t\t* FILA PRINCIPAL *");
        Fila filaPrincipal = new Fila(5);
        filaPrincipal.enqueue(p1);
        filaPrincipal.enqueue(p2);
        filaPrincipal.enqueue(p3);
        filaPrincipal.enqueue(p4);
        filaPrincipal.enqueue(p5);

        Fila filaPrioridade = new Fila(5);
        Fila filaComum = new Fila(5);
        
        System.out.println("\n\tORGANIZANDO A FILA:" + filaPrincipal.tamanho());
        int tamanhoFila = filaPrincipal.tamanho(); //guarda o tamanho da fila principal para percorrer no for

        for (int i = 0; i< tamanhoFila; i++) {
            System.out.println("\nFila principal:");
            Pessoa p = filaPrincipal.dequeue();
            if (p.getIdade() > 60) {
                // fila prioridade
                System.out.println("\nFila prioridade:");
                filaPrioridade.enqueue(p);
            } else {
                // fila comum
                System.out.println("\nFila comum:");
                filaComum.enqueue(p);
            }
        }
        
        System.out.println("\n\t\t* FILA PRIORIDADE *");

        for (int i = 0; i < filaPrioridade.tamanho(); i++) {
            System.out.println(i +1 + "." + filaPrioridade.elemento(i).toString()); 
        }
        System.out.println("\n\t\t* FILA COMUM *");

        for (int i = 0; i < filaComum.tamanho(); i++) {
            System.out.println(i +1 + "." + filaComum.elemento(i).toString());       
        }
    }
}
