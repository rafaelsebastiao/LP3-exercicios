package exercicios.ex3;

public class Main {
    public static void main() {
        Playlist playlist = new Playlist();

        playlist.adicionar("Skillet - Monster");

        playlist.adicionar("Fur Elise - Beethoven");

        playlist.mostrar();

        playlist.remover("Skillet - Monster");

        playlist.mostrar();


    }
}
