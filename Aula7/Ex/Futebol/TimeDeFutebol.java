package Aula7.Ex.Futebol;

public class TimeDeFutebol {
    String nomeDoTime;
    Jogador[] jogadores = new Jogador[11];
    int vagasOcupadas = 0;

    public TimeDeFutebol(String nomeDoTime){
        this.nomeDoTime = nomeDoTime;
    }

    // Método. "void" com letra minúscula quando não é um método primitivo
    public void contratarJogador(Jogador novoJogador){
        if(vagasOcupadas < jogadores.length){
            jogadores[vagasOcupadas] = novoJogador;
            vagasOcupadas++;
            System.out.println("O jogador " + novoJogador.nome + " foi contratado!");
        } else{
            System.out.println("Não há mais vagas no time :(");
        }
    }
    
    // Método
    public void exibirEscalacao(){
        System.out.println("--------- JOGADORES CONTRATADOS ----------");
        for(int i=0; i < vagasOcupadas; i++){
            System.out.printf("%d. %s, %s \n",i+1, jogadores[i].nome, jogadores[i].posicao);
        } 
    } 
}
