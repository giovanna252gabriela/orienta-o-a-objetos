package br.com.questao01;

public class Professor extends Pessoa {
    private float salarioHora;
    private int horasAula;


    public Professor() {
        this.salarioHora = salarioHora;
        this.horasAula = horasAula;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }

    public float calculaSalario() {
        return salarioHora * horasAula;
    }

    public String mostraProfessor() {
        return getEmail();

    }
}



