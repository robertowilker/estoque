package kvm.com.br.estoque.ui.service;

import kvm.com.br.estoque.dao.ColaboradorDAO;
import kvm.com.br.estoque.model.Colaborador;

public class ColaboradorService {

    private final ColaboradorDAO dao = new ColaboradorDAO();

    public Colaborador getId(int colaborador){
        return dao.findById(colaborador);
    }

    public void save(Colaborador colaborador) {
        dao.save(colaborador);
    }
}
