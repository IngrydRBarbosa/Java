package Aula10.Ex;

import Aula10.Pessoa;
import Aula10.Fila.Fila;
import Aula10.Pilha.Pilha;
import javax.swing.JOptionPane;

public class EmbarqueInvertido {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ingryd", 25);
        Pessoa p2 = new Pessoa("Dirceu", 65);
        Pessoa p3 = new Pessoa("Paula", 40);
        Pessoa p4 = new Pessoa("Ana", 30);
        Pessoa p5 = new Pessoa("Solange", 70);
        Pessoa p6 = new Pessoa("Camila", 20);
        Pessoa p7 = new Pessoa("Cristina", 35);

        //FILA DE ESPERA
        Fila filaPrincipal = new Fila(7);
        System.out.println("PREENCHENDO FILA DE ESPERA:");
        filaPrincipal.enqueue(p1);
        filaPrincipal.enqueue(p2);
        filaPrincipal.enqueue(p3);
        filaPrincipal.enqueue(p4);
        filaPrincipal.enqueue(p5);
        filaPrincipal.enqueue(p6);
        filaPrincipal.enqueue(p7);
        JOptionPane.showMessageDialog(null, "FILA DE ESPERA:\n1. " + p1.getNome() + "\n2. " + p2.getNome() + "\n3. " + p3.getNome() + "\n4. " + p4.getNome() + "\n5. " + p5.getNome() + "\n6. " + p6.getNome() + "\n7. " + p7.getNome());

        Pilha pilha = new Pilha(4);
        int tamanhoMicroOnibus = 4;
        
        // int tamanhoFilaEspera = filaPrincipal.tamanho();

        System.out.println("\nRetirando da fila de espera e movendo para área de entrada:");
        for (int i = 0; i < tamanhoMicroOnibus; i++) {
            Pessoa p = filaPrincipal.dequeue();
            pilha.push(p);
        } 
        JOptionPane.showMessageDialog(null, "- Retirou da fila de espera e adicionou na 'pilha' na área de entrada\n\nPILHA NA ÁREA DE ENTRADA:\n" + p4.getNome() + "\n" + p3.getNome() + "\n" + p2.getNome() + "\n" + p1.getNome());

        System.out.println("\nPREENCHE O MICRO-ÔNIBUS:");
        for (int i = 0; i < tamanhoMicroOnibus; i++) {
            pilha.pop();
        }
        System.out.printf("\n| 4. %s |\t| 3. %s |\t\n", p1.getNome(), p2.getNome());
        System.out.printf("\n| 2. %s |\t| 1. %s |\t", p3.getNome(), p4.getNome());
        JOptionPane.showMessageDialog(null, "ORDEM DE ENTRADA NO ÔNIBUS:\n1. " + p4.getNome() + "\n2. " + p3.getNome() + "\n3. " + p2.getNome() + "\n4. " + p1.getNome());
    }
}
