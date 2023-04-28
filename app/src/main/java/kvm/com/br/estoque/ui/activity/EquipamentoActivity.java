package kvm.com.br.estoque.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kvm.com.br.estoque.R;

public class EquipamentoActivity extends AppCompatActivity {

    private static final String TITULO_APPBAR_EQUIPAMENTO = "Equipamento";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(TITULO_APPBAR_EQUIPAMENTO);
        setContentView(R.layout.activity_equipamento);
    }
}