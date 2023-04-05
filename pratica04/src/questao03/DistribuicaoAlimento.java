package questao03;

public class DistribuicaoAlimento {
    private String descAlimento;
    private float qtde;

    public boolean validaProjeto() {
        return false;
    }
    public String imprimeProjeto(){

        return null;
    }

    public DistribuicaoAlimento(String descAlimento, float qtde) {
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }
}
