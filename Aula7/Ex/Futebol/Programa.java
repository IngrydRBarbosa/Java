package Aula7.Ex.Futebol;

public class Programa {
    public static void main(String[] args) {
        // preenche objeto TimeDeFutebol
        TimeDeFutebol cruzeiro = new TimeDeFutebol("cruzeiro");

        // preenche objeto Jogador
        Jogador gabiGol = new Jogador("GabiGol", "Atacante");
        Jogador Jesus = new Jogador("Gabriel Jesus", "Goleiro");
        
        cruzeiro.contratarJogador(gabiGol);
        cruzeiro.contratarJogador(Jesus);

        cruzeiro.exibirEscalacao();
    }
}
