package kvm.com.br.estoque.model;

public class Endereco {

    private long id;
    private long cep;
    private String rua;
    private long numero;

    public Endereco(){}

    public Endereco(long cep, String rua, long numero) {
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
    }

    public Endereco(long id, long cep, String rua, long numero) {
        this.id = id;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", cep=" + cep +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                '}';
    }
}
