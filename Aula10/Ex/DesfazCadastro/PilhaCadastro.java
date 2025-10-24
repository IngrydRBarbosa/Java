package Aula10.Ex.DesfazCadastro;
import javax.swing.JOptionPane;

import Aula10.Pessoa;

public class PilhaCadastro {
    private Pessoa[] elementos;
    private int topo;
    private int capacidade;

    public PilhaCadastro(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Pessoa[capacidade];
        this.topo = -1;
    }

    public void push(Pessoa elemento) {
        if (topo == capacidade -1) {
            System.out.println("A pilha está cheia! Não foi possível cadastrar a pessoa " + elemento.getNome());
            return;
        }
        topo++;
        elementos[topo] = elemento;
        System.out.println("A pessoa " + elemento.getNome() + " foi cadastrada no topo da pilha");
    }

    public Pessoa peek() {
        // para ver quem está no topo da pilha
        if(isEmpty()) {
            System.out.println("A pilha está vazia");
            return null;
        }
        return elementos[topo];
    }

    public Pessoa pop() {
        // remove o item do topo
        if(isEmpty()) {
            System.out.println("A pilha está vazia");
            return null;
        }
        Pessoa p = elementos[topo];
        elementos[topo] = null; //limpando o topo
        topo--; //retira 1 do "contador" do topo
        JOptionPane.showMessageDialog(null, "A pessoa " + p.getNome() + " foi removida do cadastro");
        return p;
    } 

    public boolean isEmpty() {
        return topo == -1;
    }

    public int tamanho() {
        // mostra o tamanho da pilha
        return topo +1;
    }
}
