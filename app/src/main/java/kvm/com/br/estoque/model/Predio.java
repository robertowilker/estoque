package kvm.com.br.estoque.model;

public class Predio {

    private long id;
    private String cliente;
    private String nome;
    private Endereco endereco;

    public Predio(){}

    public Predio(long id, String cliente, String nome, Endereco endereco) {
        this.id = id;
        this.cliente = cliente;
        this.nome = nome;
        this.endereco = endereco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Predio{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
