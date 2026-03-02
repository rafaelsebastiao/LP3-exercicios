package lista_exercicios_26_02_to_05_03;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        //5) String: vogais e normalização
        //Leia uma frase. Conte vogais (a,e,i,o,u). Mostre tamanho sem espaços e a frase em
        //maiúsculo.
        //Dica: Use toLowerCase(), replace(" ",""), length(); percorra chars.

        Scanner sc = new Scanner(System.in);

        String frase, fraseSemEspacos;

        int quantVogais=0, tamanhoSemEspacos;

        System.out.print("Digite uma frase: ");
        frase = sc.nextLine();

        for (char letra : frase.toCharArray()) {
            String letraAnalisada = String.valueOf(letra);

            if (letraAnalisada.equalsIgnoreCase("a") || letraAnalisada.equalsIgnoreCase("e") || letraAnalisada.equalsIgnoreCase("i") || letraAnalisada.equalsIgnoreCase("o") || letraAnalisada.equalsIgnoreCase("u")) {
                quantVogais += 1;
            }

        }

        fraseSemEspacos = frase.replace(" ", "");
        tamanhoSemEspacos = fraseSemEspacos.length();

        System.out.printf("\n\nQuantidade de vogais: %d ", quantVogais);
        System.out.printf("\nTamanho sem espaços: %d", tamanhoSemEspacos);
        System.out.printf("\nFrase em maiúsculo: %s", frase.toUpperCase() );

    }
}
