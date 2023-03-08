package exercicio2;

public class EmpregadoDaFaculdade {

        private String nome;
        private double salario;
        private int horasAula;
        double getGastos(){
            return this.horasAula*40+this.salario;
        }
        String getInfo(){
            return "nome:” + this.nome + " com getGastos() “ + this.salario;
        }
    }

