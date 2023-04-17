package kvm.com.br.estoque.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import kvm.com.br.estoque.R;
import kvm.com.br.estoque.model.Colaborador;
import kvm.com.br.estoque.ui.ConstantesActivity;
import kvm.com.br.estoque.ui.service.ColaboradorService;

public class ColaboradorActivity extends AppCompatActivity implements ConstantesActivity {

    private ColaboradorService service = new ColaboradorService();
    private Colaborador colaborador;

    private TextView nomeTextView;
    private TextView emailTextView;
    private TextView cpfTextView;
    private TextView dataDeNascimentoTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(COLABORADOR_ACTIVITY_TITULO_APPBAR);
        setContentView(R.layout.activity_colaborador);

        nomeTextView = findViewById(R.id.activity_colaborador_nome);
        emailTextView = findViewById(R.id.activity_colaborador_email);
        cpfTextView = findViewById(R.id.activity_colaborador_cpf);
        dataDeNascimentoTextView = findViewById(R.id.activity_colaborador_dataDeNascimento);

        if (service.getId(0) != null){
            colaborador = service.getId(0);

            nomeTextView.setText(colaborador.getNome());
            emailTextView.setText(colaborador.getEmail());

            String cpf = String.valueOf(colaborador.getCpf());
            cpfTextView.setText(cpf);

            dataDeNascimentoTextView.setText(colaborador.getDataDeNascimento());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_colaborador_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.activity_colaborador_menu_editar){
            abreFormularioColaboradorActivityModoEdita();
        }
        return super.onOptionsItemSelected(item);
    }

    private void abreFormularioColaboradorActivityModoEdita() {
        Intent vaiParaFormularioColaboradorActivityModoEdita = new Intent(
                ColaboradorActivity.this, FormularioColaboradorActivity.class);
        startActivity(vaiParaFormularioColaboradorActivityModoEdita);
    }
}
