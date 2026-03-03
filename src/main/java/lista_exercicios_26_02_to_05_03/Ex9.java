package lista_exercicios_26_02_to_05_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        // 9) Mini-CRUD de tarefas (arrays paralelos)
        //Crie arrays id/descricao/concluida. Menu: adicionar, listar, concluir, remover. Não permita
        //vender/remover id inexistente.
        //Dica: Prepara para encapsulamento e estado válido; validações.


        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<String>descricao = new ArrayList<>();
        ArrayList<Boolean>concluida = new ArrayList<>();


        Scanner sc = new Scanner(System.in);

        int opcao=1;
        char confirm='s';

        while( (opcao >= 1 && opcao <= 4) && confirm == 's' ){
            menu();

            System.out.print("Selecione a opção desejada: ");

            opcao = Integer.parseInt(sc.nextLine() );

            switch(opcao){
                case 1: {
                    int idVenda = lerIdVenda(sc);
                    String descVenda = lerDescVenda(sc);

                    adicionarVenda(id, descricao, concluida, idVenda, descVenda);
                }
                break;

                case 2:
                    listarVendas(id, descricao, concluida);
                break;

                case 3:
                    {
                        int idVenda = lerIdVenda(sc);
                        try{
                            concluirVenda(id,  concluida, idVenda);
                        }catch(RuntimeException e){
                            System.out.println(e.getMessage());
                        }
                    }

                break;

                case 4:
                    int idVenda = lerIdVenda(sc);
                    try{
                        removerVenda(id, descricao, concluida,idVenda);
                    }catch(RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                break;
                default:
                    continue;

            }

            System.out.print("\nDeseja continuar[S/N]? ");
            confirm = sc.nextLine().charAt(0);

            confirm = String.valueOf(confirm).toLowerCase().charAt(0);
        }

        sc.close();

    }

    public static void menu(){
        System.out.println("========================");
        System.out.println("         VENDAS");
        System.out.println("========================\n");

        System.out.println("1 - Adicionar venda");
        System.out.println("2 - Listar vendas");
        System.out.println("3 - Concluir vendas");
        System.out.println("4 - Remover vendas");
    }

    public static int lerIdVenda(Scanner sc){
        int idVenda;

        System.out.print("\nInforme o id da venda: ");
        idVenda = Integer.parseInt(sc.nextLine() );

        return idVenda;
    }

    public static String lerDescVenda(Scanner sc){
        String descVenda;

        System.out.print("\nInforme a descrição da venda: ");
        descVenda = sc.nextLine();

        return descVenda;
    }

    public static void adicionarVenda(ArrayList<Integer>idList, ArrayList<String>descricaoList, ArrayList<Boolean>concluidaList, int id, String descricao){

        idList.add(id);
        descricaoList.add(descricao);
        concluidaList.add(false);

    }

    public static void listarVendas(ArrayList<Integer>idList, ArrayList<String> descricaoList, ArrayList<Boolean>concluidaList){

        if(idList.toArray().length == 0){
            System.out.println("Lista de vendas vazia!");
            return;
        }

        for(int i = 0; i < idList.toArray().length; i++){
            System.out.printf("\nId: %d, Descrição: %s, Concluída? %b", idList.get(i), descricaoList.get(i), concluidaList.get(i));
        }
    }

    public static void concluirVenda(ArrayList<Integer>idList, ArrayList<Boolean>concluidaList, int id){
        if (!idList.contains(id) ){
            throw new IndexOutOfBoundsException(String.format("Venda com id %d é inválida ou não foi encontrada!", id));
        }

        for(int i = 0; i < idList.toArray().length; i++){
            if (idList.get(i) == id){
                concluidaList.set(i, true);

                System.out.println("Venda concluída com sucesso!");
                break;
            }

        }

    }

    public static void removerVenda(ArrayList<Integer> idList, ArrayList<String>descricaoList, ArrayList<Boolean>concluidaList, int id){
        if (!idList.contains(id) ){
            throw new IndexOutOfBoundsException(String.format("Venda com id %d é inválida ou não foi encontrada!", id));
        }

        for(int i = 0; i < idList.toArray().length; i++){
            if (idList.get(i) == id){
                idList.remove(i);
                descricaoList.remove(i);
                concluidaList.remove(i);

                System.out.println("Venda removida com sucesso!");
                break;
            }

        }


    }


}
