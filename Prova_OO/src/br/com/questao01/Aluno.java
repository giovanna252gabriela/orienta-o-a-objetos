package br.com.questao01;

public class Aluno extends Pessoa{
    private int periodo;
    private int turma;

    public Aluno() {
        this.periodo = periodo;
        this.turma = turma;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }
    public String mostraAluno(){
        return getNome();
    }
}
