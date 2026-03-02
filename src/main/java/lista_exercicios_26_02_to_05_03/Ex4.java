package lista_exercicios_26_02_to_05_03;

import java.util.Scanner;

public class Ex4 {
    //4) Vetor: maior, menor, média e índice
    //Leia 10 inteiros em um array. Mostre maior, menor, média e o índice do maior.
    //Dica: Percorra uma vez; guarde maior/menor e posição; some para média.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        int maiorvalor=0, menorValor=0, soma=0,  indiceMaior=0;
        double media=0;

        for(int i = 0; i < 10; i++){
            System.out.printf("Digite o %dº valor: ", i+1);

            vetor[i] = sc.nextInt();

            if(i == 0){
                menorValor = vetor[i];
            }

            if (vetor[i] > maiorvalor){
                maiorvalor = vetor[i];
                indiceMaior = i;
            } else if (vetor[i] < menorValor){
                menorValor = vetor[i];
            }

            soma += vetor[i];

        }

        media = soma / (double)10;

        if(maiorvalor != menorValor){
            System.out.printf("\n\nMaior valor: %d", maiorvalor);
            System.out.printf("\nMenor valor: %d", menorValor);
            System.out.printf("\nÍndice do maior valor: %d", indiceMaior);
        }

        System.out.printf("\nMédia: %.2f", media);

    }
}
