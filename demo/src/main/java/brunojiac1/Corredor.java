package brunojiac1;

public class Corredor extends Atleta{

    private Integer qtdCompeticoes, qualidadeCompeticao;
    private Double mediaPontuacao;

    public Corredor(Integer id, String nome, Integer qtdCompeticoes, Double mediaPontuacao, Integer qualidadeCompeticao) {
        super(id, nome);
        this.qtdCompeticoes = qtdCompeticoes;
        this.mediaPontuacao = mediaPontuacao;
        this.qualidadeCompeticao = qualidadeCompeticao;
    }

    @Override
    public Double calcPontosTotais() {
        return qtdCompeticoes * mediaPontuacao * qualidadeCompeticao * 0.15;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Corredor: \n" +
                "Qtd Competições: " + qtdCompeticoes + "\n" +
                "Média Pontuação: " + mediaPontuacao + "\n" +
                "Qualidade Competicao=" + qualidadeCompeticao + "\n" +
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

    public Integer getQualidadeCompeticao() {
        return qualidadeCompeticao;
    }

    public void setQualidadeCompeticao(Integer qualidadeCompeticao) {
        this.qualidadeCompeticao = qualidadeCompeticao;
    }
}
