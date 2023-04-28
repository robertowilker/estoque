package kvm.com.br.estoque.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import kvm.com.br.estoque.R;
import kvm.com.br.estoque.ui.ConstantesActivity;

public class PredioActivity extends AppCompatActivity implements ConstantesActivity{

    private TextView clienteTextView;
    private TextView nomeTextView;
    private TextView ruaTextView;
    private TextView numeroTextView;
    private TextView cepTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(PREDIO_ACTIVITY_TITULO_APPBAR);
        setContentView(R.layout.activity_predio);

        vinculaCamposDoLayout();
    }

    private void vinculaCamposDoLayout() {
        clienteTextView = findViewById(R.id.activity_predio_cliente);
        nomeTextView = findViewById(R.id.activity_predio_nome);
        ruaTextView = findViewById(R.id.activity_predio_rua);
        numeroTextView = findViewById(R.id.activity_predio_numero);
        cepTextView = findViewById(R.id.activity_predio_cep);
    }
}
