package kvm.com.br.estoque.model;

public class Equipamento {

    private long id;
    private String nome;
    private String marca;
    private String modelo;
    private StatusDoEquipamento status;
    private String qrCode;
    private Predio predio;
    private String sala;
    private Estoque estoque;
    private String observacao;
    private String numeroDeSerie;

    public Equipamento(){}

    public Equipamento(String nome, String marca, String modelo, StatusDoEquipamento status, String qrCode, Predio predio, String sala, Estoque estoque, String observacao, String numeroDeSerie) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.status = status;
        this.qrCode = qrCode;
        this.predio = predio;
        this.sala = sala;
        this.estoque = estoque;
        this.observacao = observacao;
        this.numeroDeSerie = numeroDeSerie;
    }

    public Equipamento(long id, String nome, String marca, String modelo, StatusDoEquipamento status, String qrCode, Predio predio, String sala, Estoque estoque, String observacao, String numeroDeSerie) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.status = status;
        this.qrCode = qrCode;
        this.predio = predio;
        this.sala = sala;
        this.estoque = estoque;
        this.observacao = observacao;
        this.numeroDeSerie = numeroDeSerie;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public StatusDoEquipamento getStatus() {
        return status;
    }

    public void setStatus(StatusDoEquipamento status) {
        this.status = status;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public Predio getPredio() {
        return predio;
    }

    public void setPredio(Predio predio) {
        this.predio = predio;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", status=" + status +
                ", qrCode='" + qrCode + '\'' +
                ", predio=" + predio +
                ", sala='" + sala + '\'' +
                ", estoque=" + estoque +
                ", observacao='" + observacao + '\'' +
                ", numeroDeSerie='" + numeroDeSerie + '\'' +
                '}';
    }
}
