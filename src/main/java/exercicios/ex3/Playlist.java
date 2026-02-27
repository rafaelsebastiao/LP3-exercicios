package exercicios.ex3;

import java.util.ArrayList;

public class Playlist {
    ArrayList<String> musicas = new ArrayList<>();

    public void adicionar(String musica){
        musicas.add(musica);
    }

    public void remover(String musica){
        musicas.remove(musica);
    }

    public void mostrar(){
        for(String musica: musicas){
            System.out.println(musica);
        }
    }

}
