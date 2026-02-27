package exercicio_fixacao;

public class Main {
    public static void main() {
        Paciente p1 = new Paciente("Robersvaldo", 30, 80.5);
        Paciente p2 = new Paciente("Haroldo", 15, 73);
        Paciente p3 = new Paciente("Hebert", 50, 94.7);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

    }
}
