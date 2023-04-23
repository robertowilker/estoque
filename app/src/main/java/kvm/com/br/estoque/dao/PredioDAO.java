package kvm.com.br.estoque.dao;

import java.util.ArrayList;
import java.util.List;

import kvm.com.br.estoque.model.Predio;

public class PredioDAO {

    private static List<Predio> lista = new ArrayList<>();

    public void save(Predio predio){
        lista.add(predio);
    }

    public Predio getById(long posicao){
        int posicaoInt =  (int) posicao;
        return lista.get(posicaoInt);
    }
}
