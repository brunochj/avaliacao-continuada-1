package brunojiac1;

public abstract class Atleta {

    private Integer id;
    private String nome;

    public Atleta(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public abstract Double calcPontosTotais();

    @Override
    public String toString() {
        return "Atleta: \n" +
                "ID: " + id + "\n" +
                "Nome: '" + nome + '\n';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
