package kvm.com.br.estoque.application;

import android.app.Application;

import kvm.com.br.estoque.dao.ColaboradorDAO;
import kvm.com.br.estoque.model.Colaborador;
import kvm.com.br.estoque.model.Endereco;
import kvm.com.br.estoque.ui.service.ColaboradorService;

public class EstoqueApplication extends Application {

    private final ColaboradorService colaboradorService = new ColaboradorService();
    private Colaborador colaborador;

    @Override
    public void onCreate() {
        super.onCreate();

        colaborador = new Colaborador(
                "Cleiton Martinele",
                "12/4/1990",
                "claitin.martin@kvminformatica.com.br",
                11122233344L,
                "123",
                new Endereco(0, 4856720L, "Rua Junqueira", 92));

        colaboradorService.save(colaborador);
    }
}
