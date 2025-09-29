package Aula4;

public class LacosRepeticao {
    public static void main(String[] args) {
        int cont = 1;

        // PRÉ TESTADO //
        while(cont <= 10) { 
            System.out.println(cont);
            cont += 1; //igual a cont ++ mas posso definir quanto irá somar enquanto no ++ sempre irá somar 1//
        }

        // PÓS TESTADO -> melhor usar quando não sabemos o número de vezes que o código será repetido //
        do { 
            System.out.println(cont);
            cont ++;
        } while(cont <= 10);

        // CONTROLADO //
        for(int i = 1; i <= 10; i++) {
            if(i >= 5 || i <= 6){
                continue; // continua dentro do laço mas pula para a próxima linha //
            }
            System.out.println(i);
        }
        for(int i = 1; i <= 10; i++) {
            if(i >= 5 && i <= 6){
                break; // código roda até i for igual a 4 //
            }
            System.out.println(i);
        }
    }
}
