package lista_exercicios_26_02_to_05_03;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        // 2) Contador (for e while)
        //Leia N. Imprima de 1 até N (for) e de N até 1 (while). Conte pares e ímpares no percurso 1..N.
        //Dica: Reforce diferença de controle entre for e while.

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}
