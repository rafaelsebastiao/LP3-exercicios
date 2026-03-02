package lista_exercicios_26_02_to_05_03;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // 6) Métodos utilitários (menu)
        //Crie métodos: ehPar(int), fatorial(int) (n≥0), primo(int). Faça um menu (switch) chamando
        //cada um.
        //Dica: Treina decomposição em funções e reutilização

        Scanner sc = new Scanner(System.in);

        int opcao=0,  valor;
        char confirm;

        while(opcao != 4){
            cabecalho();
            System.out.println("1 - Verificar se é par");
            System.out.println("2 - Calcular fatorial");
            System.out.println("3 - Verificar se é primo");
            System.out.println("4 - Sair");
            System.out.print("Selecione a opção desejada: ");
            opcao = sc.nextInt();


            if (opcao < 1 || opcao > 4){
                System.out.println("\n\nOpção inválida!");
                System.out.print("Pressione qualquer tecla para continuar...");
                sc.nextLine();

            }else if (opcao == 4){
                continue;
            }else{
                System.out.print("\nDigite um valor: ");
                valor = sc.nextInt();

                switch(opcao){
                    case 1:
                        System.out.println(ehPar(valor) == true ? "\n\nÉ par!\n\n" : "\n\nÉ ímpar!\n\n");
                        break;
                    case 2:
                        System.out.printf("\n\nFatorial de %d: %d \n\n", valor, fatorial(valor));
                        break;
                    case 3:
                        System.out.println(ehPrimo(valor) == true ? "\n\nÉ primo!\n\n" : "\n\nNão é primo!\n\n");

                        break;

                }

            }


            System.out.print("Deseja continuar? [S/N]? ");
            confirm = sc.next().charAt(0);

            opcao = String.valueOf(confirm).equalsIgnoreCase("n") ? 4 : opcao;


        }


    }

    public static boolean ehPar(int n){
        return n % 2 == 0;
    }

    public static int fatorial(int n){
        return(n == 1? n : n * fatorial(n - 1));
    }

    public static boolean ehPrimo(int n){
        int divisores = 2;

        for(int i = 2; i <= (int)n/2; i++){
            if(n % i == 0){
                divisores += 1;
            }
        }

        return divisores == 2;

    }

    public static void cabecalho(){
        System.out.println("========================");
        System.out.println("         MENU");
        System.out.println("========================");
    }

}
