package kvm.com.br.estoque.model;

public class Estoque {

    private long id;
    private String prateleira;
    private String caixa;

    public Estoque(){}

    public Estoque(long id, String prateleira, String caixa) {
        this.id = id;
        this.prateleira = prateleira;
        this.caixa = caixa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }

    public String getCaixa() {
        return caixa;
    }

    public void setCaixa(String caixa) {
        this.caixa = caixa;
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "id=" + id +
                ", prateleira='" + prateleira + '\'' +
                ", caixa='" + caixa + '\'' +
                '}';
    }
}
