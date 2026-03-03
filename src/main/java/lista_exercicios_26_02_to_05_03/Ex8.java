package lista_exercicios_26_02_to_05_03;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // 8) Matriz 3x3 (somas)
        //Leia matriz 3x3. Imprima soma de cada linha, soma de cada coluna e soma da diagonal
        //principal.
        //Dica: Dois laços; cuidado com índices; diagonal i==j

        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[3][3];

        int [] somaLinha = new int[3];
        int [] somaColuna = new int[3];

        int somaDiagPrincipal=0;


        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("matriz[%d][%d]: ", i+1, j+1);
                matriz[i][j] = sc.nextInt();

                somaLinha[i] += matriz[i][j];

                if(i == j){
                    somaDiagPrincipal += matriz[i][j];
                }
            }
            System.out.println();

        }

        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 3; i++){
                somaColuna[j] += matriz[i][j];
            }
        }

        for(int i = 0; i < 3; i++){
            System.out.println(String.format("Soma da %dº linha: %d", i+1, somaLinha[i]));
            System.out.println(String.format("Soma da %dº coluna: %d", i+1, somaColuna[i]));
        }

        System.out.println(String.format("Soma da diagonal principal: %d", somaDiagPrincipal));

    }
}
