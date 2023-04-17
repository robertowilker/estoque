package kvm.com.br.estoque.model;

public class Estoque {

    private long id;
    private Predio predio;
    private int andar;
    private String prateleira;
    private String caixa;

    public Estoque(){}

    public Estoque(long id, Predio predio, int andar, String prateleira, String caixa) {
        this.id = id;
        this.predio = predio;
        this.andar = andar;
        this.prateleira = prateleira;
        this.caixa = caixa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Predio getPredio() {
        return predio;
    }

    public void setPredio(Predio predio) {
        this.predio = predio;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
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
                ", predio=" + predio +
                ", andar=" + andar +
                ", prateleira='" + prateleira + '\'' +
                ", caixa='" + caixa + '\'' +
                '}';
    }
}
