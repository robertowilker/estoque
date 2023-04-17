package kvm.com.br.estoque.model;

public class Sala {

    private long id;
    private String nome;
    private int andar;
    private Predio predio;

    public Sala(){}

    public Sala(long id, String nome, int andar, Predio predio) {
        this.id = id;
        this.nome = nome;
        this.andar = andar;
        this.predio = predio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public Predio getPredio() {
        return predio;
    }

    public void setPredio(Predio predio) {
        this.predio = predio;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", andar=" + andar +
                ", predio=" + predio +
                '}';
    }
}
