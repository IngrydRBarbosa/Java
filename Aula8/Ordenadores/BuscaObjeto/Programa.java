package Aula8.Ordenadores.BuscaObjeto;

public class Programa {
    public static void main(String[] args) {
        item[] itens = {
            new item("Uva", 10),
            new item("Maça", 8),
            new item("Pera", 12),
            new item("Arroz", 9),
            new item("Batata", 12),
            new item("Milho", 12)
        };
        String busca;
        for(int i = 0; i < itens.length; i++) {
            System.out.println("- Nome: " + itens[i].nome + " - Valor: " + itens[i].valor);
        }
        buscaObjeto.selectionSortPorNome(itens);
        System.out.println("\n\n\n");
        for(int i = 0; i < itens.length; i++) {
            System.err.println("- Nome: " + itens[i].nome + " - Valor: " + itens[i].valor);
        }
    }
}
