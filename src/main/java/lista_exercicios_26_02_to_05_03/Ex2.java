package lista_exercicios_26_02_to_05_03;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}
