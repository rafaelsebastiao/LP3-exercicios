package exercicios.ex1;

public class ContaBancaria {
    private double saldo = 0;

    public ContaBancaria(){

    }

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor) throws IllegalArgumentException{

        if(valor <= 0){
            throw new IllegalArgumentException("Valor não pode ser menor ou igual a zero!");
        }
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "================\n" +"CONTA BANCARIA\n" + "================\n\n" + String.format("Saldo: R$ %.2f", saldo);

    }
}
