package Aula10.Ex;

import Aula10.Pessoa;
import Aula10.Fila.Fila;
import Aula10.Pilha.Pilha;

public class EmbarqueInvertido {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ingryd", 25);
        Pessoa p2 = new Pessoa("Dirceu", 65);
        Pessoa p3 = new Pessoa("Paula", 40);
        Pessoa p4 = new Pessoa("Ana", 30);
        Pessoa p5 = new Pessoa("Solange", 70);
        Pessoa p6 = new Pessoa("Camila", 20);
        Pessoa p7 = new Pessoa("Cristina", 35);

        int tamanhoMicroOnibus = 4;

        Fila filaPrincipal = new Fila(7);
        filaPrincipal.enqueue(p1);
        filaPrincipal.enqueue(p2);
        filaPrincipal.enqueue(p3);
        filaPrincipal.enqueue(p4);
        filaPrincipal.enqueue(p5);
        filaPrincipal.enqueue(p6);
        filaPrincipal.enqueue(p7);

        Pilha pilha = new Pilha(4);
        int tamanhoPilhaEntrada = pilha.tamanho();
        int tamanhoFila = filaPrincipal.tamanho();
        for (int i = 0; i < tamanhoFila; i++) {
            Pessoa p = filaPrincipal.dequeue();
            filaPrincipal.dequeue();
            pilha.push(p);
        }
        while (tamanhoPilhaEntrada < tamanhoMicroOnibus) {
            pilha.pop();
        }
    }
}
