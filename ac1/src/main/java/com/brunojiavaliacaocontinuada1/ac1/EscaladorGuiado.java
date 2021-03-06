package com.brunojiavaliacaocontinuada1.ac1;

public class EscaladorGuiado extends Escalador{
    private Double forca, resistencia, explosao, flexibilidade, pontos;

    public EscaladorGuiado(String nome, Double forca, Double resistencia, Double explosao, Double flexibilidade) {
        super(nome);
        this.forca = forca;
        this.resistencia = resistencia;
        this.explosao = explosao;
        this.flexibilidade = flexibilidade;
        this.pontos = calcPontos();
    }

    @Override
    public Double calcPontos() {
        return (((forca + resistencia) * 0.6) + ((explosao + flexibilidade) * 0.4))/2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Escalador Guiado: \n" +
                "Força: " + forca + "\n" +
                "Resistência=" + resistencia + "\n" +
                "Flexibilidade: " + flexibilidade + "\n" +
                "Explosão: " + explosao + "\n" +
                "Pontos: " + this.calcPontos();
    }

    public Double getPontos() {
        return pontos;
    }

    public void setPontos(Double pontos) {
        this.pontos = pontos;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Double getResistencia() {
        return resistencia;
    }

    public void setResistencia(Double resistencia) {
        this.resistencia = resistencia;
    }

    public Double getExplosao() {
        return explosao;
    }

    public void setExplosao(Double explosao) {
        this.explosao = explosao;
    }

    public Double getFlexibilidade() {
        return flexibilidade;
    }

    public void setFlexibilidade(Double flexibilidade) {
        this.flexibilidade = flexibilidade;
    }
}
