package exercicios.ex4;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();

        System.out.println(jogo.toString());

        jogo.marcarPonto();
        jogo.marcarPonto();
        jogo.marcarPonto();

        System.out.println(jogo.toString());

        jogo.reset();

        System.out.println(jogo.toString());
    }
}
