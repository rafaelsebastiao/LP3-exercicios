package lista_exercicios_26_02_to_05_03;

//3) Tabuada formatada
//Leia x (1 a 100) e imprima tabuada de 1 a 10 no formato: x * i = resultado.
//Dica: Valide x; use for de 1..10; formate saída.

import java.util.Scanner;

public class Ex2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.print("Digite um número para ver sua tabuada: ");
        x = sc.nextInt();

        System.out.println("===========");

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", x, i, x * i);
        }

        System.out.println("===========");
    }
}
