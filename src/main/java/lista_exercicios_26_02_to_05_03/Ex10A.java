package lista_exercicios_26_02_to_05_03;

import java.util.Scanner;

public class Ex10A {


    public static void main(String[] args) {
        //     // 10) Gancho LPR3: sobrecarga + ArrayList
        //    //A) Crie sobrecarga de calcularArea: (lado) e (base,altura).


        Scanner sc = new Scanner(System.in);

        int opc;
        double lado1, lado2;

        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");

        System.out.print("Digite a opção desejada: ");
        opc = sc.nextInt();

        if(opc == 1){
            System.out.print("Informe o valor do lado: ");
            lado1 = sc.nextDouble();

            System.out.printf("\n\nA área do quadrado %.2fmX%.2fm vale: %.2fm²", lado1, lado1, calcularArea(lado1));
        }
        else{
            System.out.print("Informe o valor da base: ");
            lado1 = sc.nextDouble();

            System.out.print("Informe o valor da altura: ");
            lado2 = sc.nextDouble();

            System.out.printf("\n\nA área do retângulo %.2fmX%.2fm vale: %.2fm²", lado1, lado2, calcularArea(lado1, lado2));
        }


    }

    public static double calcularArea(double lado){
        return lado*lado;
    }

    public static double calcularArea(double base, double altura){
        return base * altura;
    }
}
