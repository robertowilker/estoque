package kvm.com.br.estoque.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import kvm.com.br.estoque.R;
import kvm.com.br.estoque.ui.adapter.recyclerview.ListaEquipamentoAdapter;
import kvm.com.br.estoque.ui.service.EquipamentoService;

public class ListaEquipamentoActivity extends AppCompatActivity {

    private static final String TITULO_APPBAR_LISTA_EQUIPAMENTOS = "Lista Equipamentos";
    private ListaEquipamentoAdapter adapter;
    private RecyclerView listaRecyclerView;
    private EquipamentoService equipamentoService = new EquipamentoService();

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_lista_equipamento_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.activity_lista_equipamento_menu_botao_novo){
            Intent vaiParaFormularioEquipamentoActivity = new Intent(
                    ListaEquipamentoActivity.this, FormularioEquipamentoActivity.class);
            startActivity(vaiParaFormularioEquipamentoActivity);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setTitle(TITULO_APPBAR_LISTA_EQUIPAMENTOS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_equipamento);

//        List<Equipamento> lista = equipamentoService.listaTodos();
//        Equipamento equipamento = new Equipamento("Processadora",
//                "Crestron",
//                "CP4",
//                StatusDoEquipamento.OK,
//                "009975",
//                null,
//                "101",
//                null,
//                "Novo",
//                "DIOCOLFKRJEOC34");
//
//        for(int i = 0; i < 9; i++){
//            lista.add(equipamento);
//        }

        listaRecyclerView = findViewById(R.id.activity_lista_equipamento_recycler_view);
        adapter = new ListaEquipamentoAdapter(this, equipamentoService.listaTodos());
        listaRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        listaRecyclerView.setLayoutManager(layoutManager);
    }
}
