package questao01;

import questao01.Conta;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {
    public void imprimeExtrato(){
        System.out.println("### extrato da conta###");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
        Date date = new Date();
        System.out.println(" saldo :"+this.getSaldo());
        System.out.println("Data: "+sdf.format(date));
    }

}
