package questao01;

import questao01.Conta;
import questao01.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Conta cp = new ContaPoupanca();
        cp.setSaldo(2121);
        cp.imprimeExtrato();
    }
}