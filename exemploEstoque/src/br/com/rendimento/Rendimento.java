package br.com.rendimento;

public class Rendimento {
    double investimentoInicial;
    double taxaRendimento;
    int numeroMeses;

    public Rendimento() {

    }
    public Rendimento(double investInicial, double taxaRendimento, int nMeses) {
        this.investimentoInicial = investInicial;
        this.taxaRendimento = taxaRendimento;
        this.numeroMeses = numeroMeses;
    }
    public double CalculoRendimento() {
        return (this.investimentoInicial * this.taxaRendimento * this.numeroMeses)+ this.investimentoInicial;
    }
    public double getInvestInicial() {
        return investimentoInicial;
    }
    public void setInvestInicial(double investInicial) {
        this.investimentoInicial = investInicial;
    }
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
    public int getNumeroMeses() {
        return numeroMeses;
    }
    public void setNumeroMeses(int nMeses) {
        this.numeroMeses = nMeses;
    }
}
