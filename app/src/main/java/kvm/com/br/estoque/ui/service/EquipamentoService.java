package kvm.com.br.estoque.ui.service;

import java.util.List;

import kvm.com.br.estoque.dao.EquipamentoDAO;
import kvm.com.br.estoque.model.Equipamento;

public class EquipamentoService {

    private final EquipamentoDAO equipamentoDao = new EquipamentoDAO();

    public void salva(Equipamento equipamento){
        equipamentoDao.save(equipamento);
    }

    public List<Equipamento> listaTodos(){
        return equipamentoDao.getAll();
    }
}
