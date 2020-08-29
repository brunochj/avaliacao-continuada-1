package brunojiac1;

public class Escalador extends Atleta{

    private Integer qtdCompeticoes;
    private Double mediaPontuacao;

    public Escalador(Integer id, String nome, Integer qtdCompeticoes, Double mediaPontuacao) {
        super(id, nome);
        this.qtdCompeticoes = qtdCompeticoes;
        this.mediaPontuacao = mediaPontuacao;
    }

    @Override
    public Double calcPontosTotais() {
        return qtdCompeticoes * mediaPontuacao * 0.25;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Escalador: \n" +
                "Qtd Competições: " + qtdCompeticoes + "\n" +
                "Média Pontuação: " + mediaPontuacao + "\n" +
                "Pontos: " + this.calcPontosTotais() + "\n";
    }

    public Integer getQtdCompeticoes() {
        return qtdCompeticoes;
    }

    public void setQtdCompeticoes(Integer qtdCompeticoes) {
        this.qtdCompeticoes = qtdCompeticoes;
    }

    public Double getMediaPontuacao() {
        return mediaPontuacao;
    }

    public void setMediaPontuacao(Double mediaPontuacao) {
        this.mediaPontuacao = mediaPontuacao;
    }
}
