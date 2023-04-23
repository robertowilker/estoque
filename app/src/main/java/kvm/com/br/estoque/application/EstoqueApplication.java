package kvm.com.br.estoque.application;

import android.app.Application;

import java.util.Arrays;

import kvm.com.br.estoque.dao.ColaboradorDAO;
import kvm.com.br.estoque.dao.PredioDAO;
import kvm.com.br.estoque.model.Cliente;
import kvm.com.br.estoque.model.Colaborador;
import kvm.com.br.estoque.model.Endereco;
import kvm.com.br.estoque.model.Predio;
import kvm.com.br.estoque.ui.service.ColaboradorService;

public class EstoqueApplication extends Application {

    private final ColaboradorService colaboradorService = new ColaboradorService();
    private Colaborador colaborador;
    private Predio predio;
    private Cliente cliente;
    private PredioDAO predioDAO = new PredioDAO();

    @Override
    public void onCreate() {
        super.onCreate();

        colaborador = new Colaborador(
                "Cleiton Martinele",
                "12/4/1990",
                "claitin.martin@kvminformatica.com.br",
                11122233344L,
                "123",
                new Endereco(0,
                        4856720L,
                        "Rua Junqueira",
                        92,
                        "jD Campinas",
                        "São Paulo",
                        "SP",
                        "casa"));

        colaboradorService.save(colaborador);

        cliente = new Cliente(0L, "Itau", Arrays.asList());

        predio = new Predio(0L,
                cliente,
                "3500",
                new Endereco(1,
                        "Brigadeiro Faria Lima",
                        3500,
                        "Pinheiros",
                        "São Paulo",
                        "SP",
                        "Predio")
        );

        predioDAO.save(predio);
    }
}
