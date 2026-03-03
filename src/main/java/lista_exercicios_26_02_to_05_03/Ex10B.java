package lista_exercicios_26_02_to_05_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex10B {
    public static void main(String[] args) {
        // B) Use ArrayList para guardar
        //nomes: adicionar, remover, buscar, listar.
        //Dica: Ref. sobrecarga e List/ArrayList (Oracle).

        Scanner sc = new Scanner(System.in);

        ArrayList<String>nomes = new ArrayList<>();

        String nome, confirm;
        int opcao=0, posicao=0;


        while(opcao != 5){
            menu();

            System.out.print("Digite a opção selecionada: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch(opcao){
                case 1:
                    nome = lerNome(sc);
                    adicionar(nomes, nome);
                break;

                case 2:
                    nome = lerNome(sc);
                    remover(nomes, nome);
                break;

                case 3:
                    nome = lerNome(sc);

                    posicao = buscar(nomes, nome);

                    System.out.printf(posicao >= 0 ? String.format("\nNome encontrado na posição: %d\n", posicao) : "Nome não encontrado!");

                    break;

                case 4:
                    listar(nomes);
                break;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.print("\nDeseja continuar [S/N]? ");
            confirm = sc.nextLine();

            if(!confirm.equalsIgnoreCase("s")){
                opcao = 5;
            }

        }

    }

    public static String lerNome(Scanner sc){
        String nome;

        System.out.print("Informe o nome: ");
        nome = sc.nextLine();

        return nome;
    }

    public static void adicionar(ArrayList<String>nomes, String nome){
        nomes.add(nome);
    }


    public static void remover(ArrayList<String>nomes, String nome){
        System.out.println(String.format("Nome removido: %s", nome));
        nomes.remove(nome);
    }

    public static int buscar(ArrayList<String>nomes, String nomeBuscado){

        return nomes.indexOf(nomeBuscado);

    }


    public static void listar(ArrayList<String> nomes){
        if(nomes.toArray().length == 0){
            System.out.println("Lista de nomes está vazia!");
        }


        for(String nome : nomes){
            System.out.println(String.format("Nome: %s", nome));
        }
    }

    public static void menu(){
        System.out.println("========================");
        System.out.println("         MENU");
        System.out.println("========================\n");

        System.out.println("1 - Adicionar nome");
        System.out.println("2 - Remover nome");
        System.out.println("3 - Buscar nome");
        System.out.println("4 - Listar nomes");
    }
}
