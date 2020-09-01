package com.brunojiavaliacaocontinuada1.ac1;

public class EscaladorVelocidade extends Escalador{
    private Double forca, explosao, ranking;

    public EscaladorVelocidade(String nome, Double forca, Double explosao) {
        super(nome);
        this.forca = forca;
        this.explosao = explosao;
        this.ranking = calcRanking();
    }

    @Override
    public Double calcRanking() {
        return (forca + explosao) /2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Escalador Velocidade: \n" +
                "Força: " + forca + "\n" +
                "Explosão: " + explosao + "\n" +
                "Ranking: " + this.calcRanking();
    }

    public Double getRanking() {
        return ranking;
    }

    public void setRanking(Double ranking) {
        this.ranking = ranking;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Double getExplosao() {
        return explosao;
    }

    public void setExplosao(Double explosao) {
        this.explosao = explosao;
    }
}
