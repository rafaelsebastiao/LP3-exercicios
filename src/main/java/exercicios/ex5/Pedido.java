package exercicios.ex5;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Item> itens = new ArrayList<>();

    private int quantidade;

    private double valorTotal;


    public Pedido(){

    }

    public void criarPedido(Item item){
        itens.add(item);
        quantidade+=1;
        valorTotal += item.getPreco();
    }

    public void removerPedido(Item item){
        itens.remove(item);
    }

    public void mostrarPedidos(){
        System.out.println("=========\n");
        System.out.println("Pedidos\n");
        System.out.println("=========\n\n");

        for(Item item : itens){
            System.out.printf("Pedido %d - Nome: %s\n",item.getNome() );
            System.out.printf("Pedido %d - Descricao: %s\n",item.getDescricao() );
            System.out.printf("Pedido %d - Preço: %.2f\n\n",item.getPreco() );
        }

    }

}
