package br.com.estoque;

public class Estoque {

    private String nome;
    private int qntAtual;
    private int qntMinima;

    public Estoque() {
    }

    public Estoque(String nome, int qntAtual, int qntMinima) {
        this.nome = nome;
        this.qntAtual = qntAtual;
        this.qntMinima = qntMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQntAtual() {
        return qntAtual;
    }

    public void setQntAtual(int qntAtual) {
        this.qntAtual = qntAtual;
    }

    public int getQntMinima() {
        return qntMinima;
    }

    public void setQntMinima(int qntMinima) {
        this.qntMinima = qntMinima;
    }

    public void darBaixa(int qtde) {
        if (this.qntAtual > 0) {
            this.qntAtual -= qtde;
            System.out.println("Quantidade atual do estoque : " + this.qntAtual);
        } else
            System.out.println("Quantidade_Estoque.Estoque vazio");
    }

    public String mostra() {
        return getNome() + "\n" + getQntMinima() + "\n" + getQntAtual();
    }

    public boolean precisaRepor() {
        if (this.qntAtual <= this.qntMinima)
            return true;
        else
            return false;
    }
}

