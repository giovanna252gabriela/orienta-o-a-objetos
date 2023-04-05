package questao01;

public abstract class Conta {
    private double Saldo;

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        this.Saldo = saldo;
    }
    public abstract void imprimeExtrato();
}
