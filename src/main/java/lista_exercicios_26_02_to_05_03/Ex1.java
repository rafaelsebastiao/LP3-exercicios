package lista_exercicios_26_02_to_05_03;

import java.util.Scanner;

public class Ex1 {
    public static void main() {
        /*
        * Leia 3 notas (0 a 10). Se alguma nota for inválida, solicite novamente. Mostre média e
        situação (Aprovado ≥ 6).
        Dica: Use laço para validar entrada; calcule média; use if/else para a situação
        * */

        Scanner sc = new Scanner(System.in);

        double nota = 0, media=0;
        int contador=1;

        while(contador <= 3){
            System.out.printf("Digite a %d º nota: ", contador);
            nota = sc.nextDouble();

            if (nota < 0 || nota > 10){
                System.out.println("\nNota inválida!\n");
                continue;
            }

            media +=  nota;
            contador += 1;


        }

        media= media/3;

        System.out.printf("\n\nA média do aluno vale: %.2f\n\n", media);




        sc.close();
    }
}
