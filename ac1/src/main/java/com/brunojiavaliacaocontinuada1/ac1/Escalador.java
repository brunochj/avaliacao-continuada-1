package com.brunojiavaliacaocontinuada1.ac1;

public abstract class Escalador {
    private String nome;

    public Escalador(String nome) {
        this.nome = nome;
    }

    public abstract Double calcRanking();

    @Override
    public String toString() {
        return "Escalador: " +
                "Nome: " + nome + '\n';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
