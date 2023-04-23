package kvm.com.br.estoque.model;

import java.util.List;

public class Cliente {

    private long id;
    private String nome;
    private List<Predio> predios;

    public Cliente(){}

    public Cliente(long id, String nome, List<Predio> predios) {
        this.id = id;
        this.nome = nome;
        this.predios = predios;
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

    public List<Predio> getPredios() {
        return predios;
    }

    public void setPredios(List<Predio> predios) {
        this.predios = predios;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", predios=" + predios +
                '}';
    }
}
