public class Jogo {
    private int id;
    private String nome;
    private String criador;
    private String dataLancamento;

    public Jogo() {}

    public Jogo(int id, String nome, String criador, String dataLancamento) {
        this.id = id;
        this.nome = nome;
        this.criador = criador;
        this.dataLancamento = dataLancamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\nNome: " + nome + "Criador: " + criador + "\nData de lancamento: " + dataLancamento
                + "\n";
    }
    
}
