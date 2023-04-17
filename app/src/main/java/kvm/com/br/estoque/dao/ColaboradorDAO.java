package kvm.com.br.estoque.dao;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import kvm.com.br.estoque.model.Colaborador;

public class ColaboradorDAO {

    private final static List<Colaborador> lista = new ArrayList<>();
    private static int contadorDeID = 1;

    public Colaborador findById(int colaborador){
        int id = (int) colaborador;
        Colaborador colaboradorEncontrado = lista.get(id);

        return colaboradorEncontrado;
    }

    public void save(Colaborador colaborador) {
        colaborador.setId(contadorDeID);
        lista.add(colaborador);
        Log.i("dao", "save: " + colaborador.toString());
        contadorDeID++;
    }
}
