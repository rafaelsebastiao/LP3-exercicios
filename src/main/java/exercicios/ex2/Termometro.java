package exercicios.ex2;

public class Termometro{
    private float temperatura;

    public Termometro(float temperatura){
        this.temperatura = temperatura;
    }

    public void ajustar(float temperatura){
        if(temperatura > 100 || temperatura < -50){
            throw new IndexOutOfBoundsException("Temperatura passou dos limites!");
        }

        this.temperatura = temperatura;
    }

    public float getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "Termometro{" +
                "temperatura=" + temperatura +
                '}';
    }
}
