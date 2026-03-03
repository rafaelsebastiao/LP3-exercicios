package lista_exercicios_26_02_to_05_03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // 7) Login simples (arrays paralelos)
        //Guarde 5 usuários e 5 senhas em arrays (mesmo índice). Leia user/senha e valide. Permita 3
        //tentativas.
        //Dica: Busca linear; controle de tentativas; mensagens claras

        Scanner sc = new Scanner(System.in);

        String [] usuarios = {"admin", "community", "manager", "employee", "supervisor"};
        String [] senhas = {"admin", "12345", "@br123!", "ct789", "12347_@jdk"};

        String usuario = new String(), senha = new String();

        int tentativas=0;
        boolean logado=false;

        while(tentativas < 3 && logado == false){
            System.out.print("Usuario: ");
            usuario = sc.nextLine();

            System.out.print("Senha: ");
            senha = sc.nextLine();

            for(int i = 0; i < usuarios.length; i++){
                if (usuario.equals(usuarios[i]) && senha.equals(senhas[i])){
                    logado = !logado;
                    break;
                }
            }

            if (!logado){
                System.out.println("\nUsuário ou senha incorreta!\n");
                System.out.printf("Tentativas restantes: %d\n\n", 3 - (tentativas + 1)) ;
                tentativas += 1;
            }


        }

        if(logado){
            System.out.printf("\n\nBem vindo, %s!\n\n", usuario);
        }else{
            System.out.println("\nVocê estourou o limite de tentativas!\n");
        }



    }

}
