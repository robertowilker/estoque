package kvm.com.br.estoque.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import kvm.com.br.estoque.R;
import kvm.com.br.estoque.ui.ConstantesActivity;

public class FormularioPredioActivity extends AppCompatActivity implements ConstantesActivity {

    private EditText clienteEditText;
    private EditText nomeEditText;
    private EditText ruaEditText;
    private EditText numeroEditText;
    private EditText cepEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(PREDIO_FORMULARIO_ACTIVITY_TITULO_APPBAR);
        setContentView(R.layout.activity_formulario_predio);

        vinculandoComponentesDoFormulario();
    }

    private void vinculandoComponentesDoFormulario() {
        clienteEditText = findViewById(R.id.activity_formulario_predio_cliente);
        nomeEditText = findViewById(R.id.activity_formulario_predio_nome);
        ruaEditText = findViewById(R.id.activity_formulario_predio_rua);
        numeroEditText = findViewById(R.id.activity_formulario_predio_numero);
        cepEditText = findViewById(R.id.activity_formulario_predio_cep);
    }
}
