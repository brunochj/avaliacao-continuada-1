package com.brunojiavaliacaocontinuada1.ac1;

public class EscaladorBoulder extends Escalador{
    private Double forca, flexibilidade, explosao;

    public EscaladorBoulder(String nome, Double forca, Double flexibilidade, Double explosao) {
        super(nome);
        this.forca = forca;
        this.flexibilidade = flexibilidade;
        this.explosao = explosao;
    }

    @Override
    public Double calcRanking() {
        return (forca + flexibilidade + explosao)/3;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Escalador Boulder: \n" +
                "Força: " + forca + "\n" +
                "Flexibilidade: " + flexibilidade + "\n" +
                "Explosão: " + explosao + "\n" +
                "Ranking: " + this.calcRanking();
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Double getFlexibilidade() {
        return flexibilidade;
    }

    public void setFlexibilidade(Double flexibilidade) {
        this.flexibilidade = flexibilidade;
    }

    public Double getExplosao() {
        return explosao;
    }

    public void setExplosao(Double explosao) {
        this.explosao = explosao;
    }
}
