package exercicios.ex4;

public class Jogo {
    private int pontos;

    public void marcarPonto(){
        this.pontos++;
    }

    public void reset(){
        this.pontos = 0;
    }


    @Override
    public String toString() {
        return "Jogo{" +
                "pontos=" + pontos +
                '}';
    }
}
