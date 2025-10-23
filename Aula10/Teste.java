package Aula10;

import Aula10.Fila.Fila;
import Aula10.FilaCircular.FilaCircular;
import Aula10.Pilha.Pilha;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Daniel", 25);
        Pessoa p2 = new Pessoa("Pedro", 20);

        //PILHA
        System.out.println("------- PILHA -------");
        Pilha pilha = new Pilha(2);
        pilha.pop();
        pilha.push(p1);
        pilha.push(p2);

        System.out.println("Olhando o topo com peek: " + pilha.peek().getNome());
        pilha.pop();
        pilha.pop();
        pilha.pop();

        //FILA
        System.out.println("\n------- FILA -------");
        FilaCircular fila = new FilaCircular(2);
        fila.dequeue();
        fila.enqueue(p1);
        fila.enqueue(p2);

        System.out.println("Olhando quem está na frente da fila: " + fila.front().getNome());
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
    }
}
