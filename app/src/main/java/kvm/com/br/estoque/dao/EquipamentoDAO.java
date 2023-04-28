package kvm.com.br.estoque.dao;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import kvm.com.br.estoque.model.Equipamento;

public class EquipamentoDAO {

    private final static List<Equipamento> lista = new ArrayList<>();
    private static int contadorDeId = 1;

    public void save(Equipamento equipamento){
        equipamento.setId(contadorDeId);
        lista.add(equipamento);
        contadorDeId++;

        Log.i("dao", "save: " + equipamento.toString());
    }

    public List<Equipamento> getAll(){
        return lista;
    }
}
