package model;

public class Despesa {
    private String descricao;
    private double valor;
    private boolean paga;

    public Despesa() {}

    public Despesa(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
        this.paga = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }
}
