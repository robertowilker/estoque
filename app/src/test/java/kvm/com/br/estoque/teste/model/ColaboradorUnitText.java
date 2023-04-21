package kvm.com.br.estoque.teste.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import kvm.com.br.estoque.model.Colaborador;
import kvm.com.br.estoque.model.Endereco;

public class ColaboradorUnitText {

    private Colaborador colaborador = new Colaborador();
    private Endereco endereco = new Endereco(
            0,
            3333333L,
            "Adolecente",
            15,
            "JD Novo Horizonte",
            "São Paulo",
            "SP",
            "Casa");;

    @Test
    public void deve_DevolverEndereco_QuandoReceberEndereco(){
        colaborador.setEndereco(endereco);
        assertEquals(colaborador.getEndereco(), endereco);
    }
}
